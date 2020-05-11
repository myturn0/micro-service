package com.apollo.controller;

import com.apollo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@RestController
public class HelloController {

    @Autowired
    private UserService userService;
    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return userService.sayHello();
    }

    @GetMapping("/hi")
    public String hi(){
        return userService.sayHi();
    }

    @GetMapping("/haha")
    public String haha(){
        return userService.sayHaha();
    }
}
