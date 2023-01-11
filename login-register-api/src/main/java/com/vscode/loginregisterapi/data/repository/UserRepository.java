package com.bismuth.loginregisterapi.data.repository;

import com.bismuth.loginregisterapi.data.models.User;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface UserRepository extends JpaRepository<User, Long> {
 
}