package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}


