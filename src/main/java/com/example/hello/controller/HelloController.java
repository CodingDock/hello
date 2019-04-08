package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot2！"+ new Date().toString();
    }
    
    
}
