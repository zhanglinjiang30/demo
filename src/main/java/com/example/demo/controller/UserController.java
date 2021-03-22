package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/register")
    public String registerUser(){
        User user = new User();
                user.setUsername("admin");
                user.setPassword(bCryptPasswordEncoder.encode("123456"));
                user.setRole("ADMIN");
        userService.addUser(user);
        return "success";
    }
}
