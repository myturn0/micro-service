package com.apollo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ：liuyunyang
 * @since ：Created in 2020/5/1
 */
@Slf4j
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
//开启仪表盘
//@EnableHystrixDashboard
public class ConsumerHystrixApplication {
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application =
                SpringApplication.run(ConsumerHystrixApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        log.info("\n----------------------------------------------------------\n\t" +
                "Application  is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                "swagger-ui: \t\thttp://" + ip + ":" + port + path + "/doc.html\n" +
                "HystrixDashboard: \t\thttp://" + ip + ":" + port + path + "/hystrix\n" +
                "----------------------------------------------------------");

    }
}
