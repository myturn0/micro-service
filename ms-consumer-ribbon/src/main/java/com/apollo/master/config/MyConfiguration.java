package com.apollo.master.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@Configuration
public class MyConfiguration {

    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        return new RoundRobinRule();
    }
}
