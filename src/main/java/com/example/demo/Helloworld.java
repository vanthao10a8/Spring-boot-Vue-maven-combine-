package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Helloworld {
    @GetMapping
    public String getHelloWorld(){
        return "Hello - world";
    }
}
