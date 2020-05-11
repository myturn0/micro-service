package com.apollo.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/2
 */
@Configuration
public class RuleConfig {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new MyRule();
    }
}
