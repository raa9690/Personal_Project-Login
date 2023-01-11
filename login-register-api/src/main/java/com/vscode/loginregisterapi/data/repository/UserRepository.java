package com.vscode.loginregisterapi.data.repository;

import com.vscode.loginregisterapi.data.models.User;

import org.springframework.data.jpa.repository.JpaRepository;


 
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String username);
}