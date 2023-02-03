package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/users")
    private boolean submitUser(@RequestBody Users user){
        userService.submitUser(user);
        return true;
    }

    @RequestMapping(value="/users/{userId}", method = RequestMethod.GET, produces = "application/json")
    private Users getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }
}
