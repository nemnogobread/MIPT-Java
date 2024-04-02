package com.example.CRUD2.controller;

import com.example.CRUD2.model.User;
import com.example.CRUD2.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;
    @GetMapping("/users")
    public String findAll(){
        List<User> users = userService.findAll();
        return "";
    }
}
