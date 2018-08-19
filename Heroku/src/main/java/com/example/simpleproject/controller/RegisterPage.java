package com.example.simpleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterPage {

    @RequestMapping(value = "/1", produces = "text/html")
    public String register(){
        return "register.html";
    }
}
