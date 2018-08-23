package com.herokuapp.toptreepirata.controller;

import com.herokuapp.toptreepirata.model.UsersEntity;
import com.herokuapp.toptreepirata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usercreate")
public class UserCreate {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String userCreate(@RequestParam("loginInput") String login,
                             @RequestParam("emailInput") String email,
                             @RequestParam("passwordInput") String password){
        UsersEntity regiterUser =new UsersEntity(login, email, password);
        userRepository.save(regiterUser);
        System.out.println("User create "+regiterUser);
        return "user";
    }

}
