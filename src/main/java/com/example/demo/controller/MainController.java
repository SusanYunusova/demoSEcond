package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getValue() {
        return "Welcome";
    }
    @GetMapping("/welcomeWithName/{name}")
    public String getWelcome(@PathVariable("name")String name){
        return "  "+ name+"  welcome!!!";
    }

    @PostMapping("/welcomeWithNamePost/{name}")
    public  String PostValue(@PathVariable("name")String name){
        return " "+ name + " WelcomeFromPOstMethod";
    }

}
