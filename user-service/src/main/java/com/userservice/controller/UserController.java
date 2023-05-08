package com.userservice.controller;

import com.userservice.dto.UserRequest;
import com.userservice.dto.UserResponse;
import com.userservice.entity.User;
import com.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public void registerUser(@RequestBody UserRequest userRequest){
        userService.registerUser(userRequest);
    }

    @GetMapping()
    public List<UserResponse> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{email}/{password}")
    public Boolean authenticate(@PathVariable String email, @PathVariable String password){
        return userService.authenticate(email, password);
    }
}
