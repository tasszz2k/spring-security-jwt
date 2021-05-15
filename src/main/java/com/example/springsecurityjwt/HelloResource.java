package com.example.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping("/")
    public String hi() {
        return "Hi";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }


}
