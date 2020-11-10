package com.upgrad.hirewheels.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping(value= {"/sayHelloMovie"})
    public String sayHello(){
        return "Hello World To All From MovieController";
    }
}


