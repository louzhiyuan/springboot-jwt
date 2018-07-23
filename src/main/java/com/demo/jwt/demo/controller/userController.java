package com.demo.jwt.demo.controller;

import com.demo.jwt.demo.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class userController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    /**
     * 该方法是注册用户的方法，默认放开访问控制
     * */

    @PostMapping("/signup")
    public void signup(@RequestBody User user){
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    }
}
