package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "To-do Application!!";
    }

    @GetMapping("/test")
    public String test(){
        return "HelloTest!!";
    }

    @GetMapping("/reTest")
    public String reTest(){
        return "HelloReTest !!";
    }
}
