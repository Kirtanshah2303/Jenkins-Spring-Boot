package com.example.SpringBootApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyContoller {
    @GetMapping("/")
    public String Home(){
        return "Hello Friends";
    }
    @GetMapping("/temp")
    public String temp(){
        return "This is for testing of Jenkins";
    }
}
