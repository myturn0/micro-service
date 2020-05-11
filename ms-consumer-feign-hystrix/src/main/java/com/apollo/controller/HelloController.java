package com.apollo.controller;

import com.apollo.service.HelloService;
import com.apollo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@RestController
public class HelloController {

    @Autowired
    public UserService userService;

    @Autowired
    public HelloService helloService;

    /**
     * 此处的mapping是一级controller，
     * 调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     * @return
     */
    @GetMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloFallback")//失败时调用默认返回,
    public String hello(){
        return userService.hello();
    }

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiFailBack") //失败时调用默认返回,demo中现在我们的客户端调用的接口实际是不存在，所以这个接口会返回下方的默认值
    public String hi(){
        return userService.sayHi();
    }

    @GetMapping("/haha")
    @HystrixCommand(fallbackMethod = "hahaFailBack")//失败时调用默认返回,demo中现在我们的客户端调用的接口实际是不存在，所以这个接口会返回下方的默认值
    public String haha(){
        return userService.sayHaha();
    }

    @GetMapping("/get/{id}")
    public String getOne(@PathVariable("id") Long id) {
        return userService.getOne(id);
    }

    @GetMapping("/get2/{id}")
    public String getTwo(@PathVariable("id") Long id) {
        return helloService.getTwo(id);
    }

    /**
     *
     *  对应上面的方法，参数必须一致，当访问失败时，hystrix直接回调用此方法
     * @return 失败调用时，返回默认值:
     */
    public String helloFallback(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--helloxxxx";
    }

    public String hiFailBack(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hixxxx";
    }

    public String hahaFailBack(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hahaxxxx";
    }

}
