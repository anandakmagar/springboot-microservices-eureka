package com.userservice.service;

import com.userservice.dto.UserRequest;
import com.userservice.dto.UserResponse;
import com.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void registerUser(UserRequest userRequest);

    public List<UserResponse> getAllUsers();

    public UserResponse mapToUserResponse(User user);

    public User findByEmail(String email);

    public Boolean authenticate(String email, String password);
}
