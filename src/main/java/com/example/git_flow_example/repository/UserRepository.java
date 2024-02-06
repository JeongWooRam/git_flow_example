package com.example.git_flow_example.repository;

import com.example.git_flow_example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User findById(Long id);
    User findByName(String name);
}
