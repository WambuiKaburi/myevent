package com.bugbuster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomePageController {

    @RequestMapping(method = RequestMethod.GET, value = "/landing")
    public ModelAndView getLandingPage() {

        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("landing-page");
        return modelView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ModelAndView getRegisterPage() {

        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("register-page");
        return modelView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/profile")
    public ModelAndView getProfilePage() {

        ModelAndView modelView = new ModelAndView();
        modelView.setViewName("profile-page");
        return modelView;
    }


}
