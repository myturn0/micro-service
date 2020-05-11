package com.apollo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayHello")
    public String sayhello(){
        return "I`m provider 2 ,Hello consumer!";
    }

    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider 2 ,Hello consumer!";
    }

    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider 2 ,Hello consumer!";
    }
}
