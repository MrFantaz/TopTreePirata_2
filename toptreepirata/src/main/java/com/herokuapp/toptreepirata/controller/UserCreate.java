package com.herokuapp.toptreepirata.controller;

import com.herokuapp.toptreepirata.model.User;
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
    public String userCreate(@RequestParam("firstNameInput") String login,
                             @RequestParam("passwordInput") String password){
        User regiterUser =new User(login,password);
        userRepository.save(regiterUser);
        System.out.println("User create "+regiterUser);
        return "user";
    }

}
