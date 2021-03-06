package com.demo.jwt.demo.repository;

import com.demo.jwt.demo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SysUser,Long>{

    SysUser findByUsername(String username);
}
