package com.example.simpleproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterPage {

    @RequestMapping(value = "/", produces = "text/html")
    public String register(){
        return "register.html";
    }
}
