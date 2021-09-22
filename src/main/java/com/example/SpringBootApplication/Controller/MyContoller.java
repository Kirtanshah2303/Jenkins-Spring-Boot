package com.example.SpringBootApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyContoller {
    @GetMapping("/")
    public String Home(){
        return "Hello Friends";
    }
}
