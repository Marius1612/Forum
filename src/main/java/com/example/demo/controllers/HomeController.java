package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    @RequestMapping("DS_Home")
    protected ModelAndView displayHome(){
        return new ModelAndView("home.html");
    }

    @RequestMapping("DS_Home/{userId}")
    public ModelAndView displayHomeL(@PathVariable Integer userId){
        return new ModelAndView("home.html");
    }
}
