package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/4
 *
 *
 * 这里是spring-cloud-config的client端
 * 这个client端，可以使provider、consumer和eureka服务器
 *
 *
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
