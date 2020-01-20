package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @GetMapping("/sayHello")
    private String sayHello(@RequestParam("id") String id){
        return "hello world,i am provider from 8082 and " + id;
    }
}
