package com.demo.jwt.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 *保存着用户的拥有什么样权限
 *用户实体是多对一的关系
 * 一个用户可以拥有多个权限
 *
 * */
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
