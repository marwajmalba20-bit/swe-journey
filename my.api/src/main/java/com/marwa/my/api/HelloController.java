package com.marwa.my.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome Marwa! This is your first Backend API!";
    }
    @GetMapping("/user")
    public User getUser() {
        return new User(1, "Marwa", "marwa@email.com");
    }
}