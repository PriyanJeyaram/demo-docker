package com.example.docker.controller;

import com.example.docker.entity.User;
import com.example.docker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepo repo;

    @PostMapping("/user")
    public String addUser(@RequestBody User user) {
        repo.save(user);
        return "User Added!";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return repo.findAll();
    }

}
