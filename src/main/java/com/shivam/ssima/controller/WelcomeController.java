package com.shivam.ssima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the application!";
    }

    @GetMapping("/user")
    public String welcomeUser(Principal principal) {
        return "Welcome to the application " + principal.getName();
    }

    @GetMapping("/admin")
    public String welcomeAdmin(Principal principal) {
        return "Welcome to the application " + principal.getName();
    }
}
