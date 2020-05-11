package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@SpringBootApplication
//标明是一个server
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);

        System.out.println("---服务监控访问地址"+"http://localhost:8761");
    }
}
