package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@SpringBootApplication
@EnableZuulProxy  //开启zuul代理
@EnableEurekaClient        //zuul服务要注册到Eureka上
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
