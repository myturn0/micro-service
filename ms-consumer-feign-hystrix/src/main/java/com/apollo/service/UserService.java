package com.apollo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@FeignClient("provider-user")
public interface UserService {
    /**
     * @FeignClient(value="provider-user") 应用名称
     * Feign中没有原生的@GetMapping/@PostMapping/@DeleteMapping/@PutMapping，要指定需要用method进行
     * <p>
     * 定义方法，方法上部使用 @RequestMapping(value="/sayHello",method= RequestMethod.GET)
     * 映射转发请求
     */
    @RequestMapping(value = "/user/sayHello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    String sayHi();

    @RequestMapping(value = "/sayHaha", method = RequestMethod.GET)
    String sayHaha();

    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    String getOne(@PathVariable("id") Long id);
}
