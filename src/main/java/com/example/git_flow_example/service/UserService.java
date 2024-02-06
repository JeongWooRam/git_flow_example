package com.example.git_flow_example.service;

import com.example.git_flow_example.domain.User;
import com.example.git_flow_example.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public User findByName(String name) { return userRepository.findByName(name); } // 기능 개발
}
