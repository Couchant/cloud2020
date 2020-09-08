package com.hallen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: ConsumerApplication
 * @Description: Consumer启动类
 * @Author: Hallen
 * @Date: 2020/9/3 12:01
 * @Version: 1.0
 */
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
