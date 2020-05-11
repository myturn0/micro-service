package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
//表明这是一个eureka客户端
@EnableEurekaClient
@SpringBootApplication
public class Provider1Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider1Application.class, args);
    }
}
