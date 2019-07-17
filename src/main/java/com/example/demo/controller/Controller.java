package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    List<User> users = new ArrayList<>();


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

    @GetMapping("/getuser")
    public List<User> getuser() {


        User user = new User();
        user.setId(1);
        user.setUserName("admin");
        user.setRole("ADMIN");
        user.setPassword("admin");
        userRepository.save(user);
        return userRepository.findAll();
    }

}
