package com.example.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/sayHello")
    private String sayHello(){
        return "hello world,i am provider from 8082";
    }
}
