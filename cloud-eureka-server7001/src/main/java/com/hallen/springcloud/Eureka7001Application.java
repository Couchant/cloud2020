package com.hallen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: Eureka7001Application
 * @Description: Eureka服务启动类
 * @Author: Hallen
 * @Date: 2020/9/10 18:30
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001Application.class,args);
    }
}
