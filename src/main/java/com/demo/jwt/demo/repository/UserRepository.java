package com.demo.jwt.demo.repository;

import com.demo.jwt.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

    User findByUsername(String username);
}
