package com.apollo.service;

import com.apollo.hystrix.HystrixFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//当HelloService对应的接口所在的服务器宕机之后，就会调用fallbackFactory中的默认处理
@FeignClient(value = "provider-user", fallbackFactory = HystrixFactory.class)
public interface HelloService {

    @RequestMapping(value = "/user/get2/{id}", method = RequestMethod.GET)
    String getTwo(@PathVariable("id") Long id);
}
