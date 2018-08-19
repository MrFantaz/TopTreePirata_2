package com.example.simpleproject.repositore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.simpleproject.controller","com.example.simpleproject.repositore"})
public class SimpleprojectApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                SpringApplication.run(SimpleprojectApplication.class, args);
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
