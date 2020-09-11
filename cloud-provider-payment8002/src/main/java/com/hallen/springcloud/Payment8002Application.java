package com.hallen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: Payment8002Application
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 17:29
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002Application {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002Application.class,args);
    }
}
