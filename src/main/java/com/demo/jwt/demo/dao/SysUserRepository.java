package com.demo.jwt.demo.dao;

import com.demo.jwt.demo.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
