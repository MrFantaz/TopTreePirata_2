package com.example.simpleproject.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserCreator {
    @RequestMapping(value = "user_create")
  public String index(){
      return "";
  }
}
