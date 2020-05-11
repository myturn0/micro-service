package com.apollo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        return "I`m provider 1 ,Hello consumer!";
    }

    @RequestMapping("/sayHi")
    public String sayHi(){
        return "I`m provider 1 ,Hello consumer!";
    }

    @RequestMapping("/sayHaha")
    public String sayHaha(){
        return "I`m provider 1 ,Hello consumer!";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "exceptionMethod")//服务熔断
    public String getOne(@PathVariable("id") Long id) {
        if (id > 10) {
            throw new RuntimeException("手动加个异常");
        }
        return "获取成功";
    }

    public String exceptionMethod(@PathVariable("id") Long id) {
        return "出现了异常，请检查参数，稍后重试！" + id;
    }

    @RequestMapping(value = "/get2/{id}", method = RequestMethod.GET)
    public String getTwo(@PathVariable("id") Long id) {
        if (id > 10) {
            return "失败";
        }
        return "获取成功";
    }
}
