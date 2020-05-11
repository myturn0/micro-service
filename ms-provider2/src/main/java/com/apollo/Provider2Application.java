package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider2Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }
}
