package com.demo.jwt.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    //测试用例
    @RequestMapping("/hello")
    public String hello(){
        return "hello this is a springboot demo";
    }
}
