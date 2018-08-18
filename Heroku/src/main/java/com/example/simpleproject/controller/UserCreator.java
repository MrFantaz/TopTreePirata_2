package com.example.simpleproject.controller;

import com.example.simpleproject.service.UserService;
import model.UsersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserCreator {
    @RequestMapping(value = "/user_create")
  public String index(){
        StringBuilder stringBuilder = new StringBuilder();
        UserService userService = new UserService();

        return userService.findUser(1).getLogin();
  }
}
