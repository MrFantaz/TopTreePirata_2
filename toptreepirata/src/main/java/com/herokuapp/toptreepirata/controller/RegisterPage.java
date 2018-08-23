package com.herokuapp.toptreepirata.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterPage {

    @Autowired
    private Logger logger;


    @RequestMapping("/")
    public String register() {
        logger.trace("We are in ctrl RegisterPage");
        return "register";
    }
}
