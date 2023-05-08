package com.authenticationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
public class AuthenticationController {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping("/authenticate/{email}/{password}")
    public String authenticate(@PathVariable String email, @PathVariable String password){
        Boolean b = webClientBuilder.build().get()
                .uri("http://user-service/users/" + email + "/" + password)
                .retrieve()
                .bodyToMono(Boolean.class)
                .block();

        if (b == true){
            return "You're successfully logged in";
        }
        else {
            return "Incorrect email/password";
        }
    }
}
