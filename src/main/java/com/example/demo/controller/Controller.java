package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/user")
    public String getUser() {
        return "Welcome Spring Security User";
    }

    @RequestMapping("/admin")
    public String getAdmin() {
        return "Welcome Spring Security Admin";
    }

    @RequestMapping("/role")
    public String getChathura() {
        return "Welcome Spring Security Chathura";
    }


}
