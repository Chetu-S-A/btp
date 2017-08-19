package com.betsol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.betsol.model.Project;
import com.betsol.repository.ProjectRepository;
import com.betsol.repository.UserRepository;
@Service("projectService")
public class ProjectServiceImpl implements ProjectService{
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public List<Project> viewAllProjects() {
		return projectRepository.findAll();
	}
}
