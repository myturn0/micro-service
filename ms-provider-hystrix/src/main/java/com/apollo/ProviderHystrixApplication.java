package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
//表明这是一个eureka客户端
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
public class ProviderHystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class, args);
    }
}
