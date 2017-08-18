package com.betsol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CertificationController {



    @RequestMapping(value="certifications/certification", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("certifications/certification");
        return modelAndView;
    }

}
