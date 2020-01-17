package com.example.provider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/sayHello")
    private String sayHello(){
        return "hello world,i am provider1 from 8083";
    }
}
