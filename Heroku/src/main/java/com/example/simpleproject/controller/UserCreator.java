package com.example.simpleproject.controller;

import com.example.simpleproject.repositore.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserCreator {
@Autowired
UserRepository userRepository;
    @RequestMapping(value = "/user_create")
  public String index(){
        return userRepository.getById(Long.getLong("1")).getLogin();
  }
}
