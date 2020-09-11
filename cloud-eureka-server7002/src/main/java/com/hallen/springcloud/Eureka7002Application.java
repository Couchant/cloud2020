package com.hallen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: Eureka7002Application
 * @Description: eureka7002启动类
 * @Author: Hallen
 * @Date: 2020/9/11 12:07
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7002Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7002Application.class,args);
    }
}
