package com.example.simpleproject.controller;

import com.example.simpleproject.repositore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("com.example.simpleproject.repositore")
@Controller
public class UserCreator {
    @Autowired
    private UserRepositore userRepositore;

    @RequestMapping(value = "/user_create")
  public String index(){
        return userRepositore.findById(Long.getLong("1")).get().getEmail();
  }
}
