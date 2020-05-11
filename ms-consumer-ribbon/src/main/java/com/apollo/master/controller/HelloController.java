package com.apollo.master.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate resttemplate;

    //用于服务发现
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://provider-user/user/sayHello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);
    }

    @RequestMapping("/hi")
    public String hi(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://provider-user/user/sayHi";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);
    }

    @RequestMapping("/haha")
    public String haha(){
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url="http://provider-user/user/sayHaha";
        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);
    }

    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println("*****" + services);

        List<ServiceInstance> serviceInstances =
                discoveryClient.getInstances("provider-user");
        for (ServiceInstance si : serviceInstances) {
            System.out.println(si.getServiceId() + "\t"
                    + si.getHost() + "\t"
                    + si.getPort() + "\t"
                    + si.getUri());
        }
        return this.discoveryClient;
    }
}
