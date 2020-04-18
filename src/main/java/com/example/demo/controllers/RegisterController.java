package com.example.demo.controllers;

import com.example.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class RegisterController {
    private UserService userService;
    @GetMapping("DS_Register")
    public String insertUser(){
        return "register";
    }

    @PostMapping("DS_Register")
    public ModelAndView insertUser(String emailAddress, String password, String username){
        userService.insertUser(emailAddress, password,username);
        return new HomeController().displayHome();
    }
}
