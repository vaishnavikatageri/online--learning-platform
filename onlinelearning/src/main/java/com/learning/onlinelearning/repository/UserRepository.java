package com.learning.onlinelearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.onlinelearning.model.User;

public interface UserRepository
extends JpaRepository<User, Long>{

}