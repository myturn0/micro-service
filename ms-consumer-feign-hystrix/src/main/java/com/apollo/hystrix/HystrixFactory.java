package com.apollo.hystrix;

import com.apollo.service.HelloService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/4
 */
@Component//不要忘记添加
public class HystrixFactory implements FallbackFactory<HelloService> {
    @Override
    public HelloService create(Throwable throwable) {
        return new HelloService() {
            @Override
            public String getTwo(Long id) {
                return "失败2";
            }
        };
    }
}
