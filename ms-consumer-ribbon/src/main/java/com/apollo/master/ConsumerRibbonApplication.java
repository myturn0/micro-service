package com.apollo.master;

import com.apollo.rule.RuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@SpringBootApplication
@EnableEurekaClient
//用于服务发现
@EnableDiscoveryClient
@RibbonClient(name = "provider-user", configuration = RuleConfig.class)
public class ConsumerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApplication.class, args);
    }
}
