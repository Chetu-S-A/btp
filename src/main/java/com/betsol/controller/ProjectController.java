package com.betsol.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.betsol.model.Project;
import com.betsol.service.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping(value="projects/project", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("projects/project");
		return modelAndView;
	}
	
	@RequestMapping(value="projects/viewallprojects", method = RequestMethod.GET)
	public ModelAndView viewAllProjects(){
		
		List<Project> hp = projectService.viewAllProjects();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("listofProject", hp);
		modelAndView.setViewName("technical/training");
		return modelAndView;
	}
	
	
	

}
