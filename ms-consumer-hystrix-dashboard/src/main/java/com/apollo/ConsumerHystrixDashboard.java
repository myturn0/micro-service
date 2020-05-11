package com.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/4
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard.class, args);
    }
}
