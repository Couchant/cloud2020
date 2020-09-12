package com.hallen.springcloud.service.demo.impl;

import com.hallen.springcloud.service.demo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: DemoServiceImpl
 * @Description: 服务发现测试类
 * @Author: Hallen
 * @Date: 2020/9/12 21:13
 * @Version: 1.0
 */
@Service
@Slf4j
public class DemoServiceImpl implements DemoService {
    @Resource
    DiscoveryClient discoveryClient;
    @Override
    public Object getDiscoveryClient() {
        List<String> services = discoveryClient.getServices();
        log.debug(services.toString());
        for (String service :
                services) {
            log.debug("-----------------------");
            log.debug("service:" + service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            log.debug(instances.toString());
            log.debug("-----------------------");
        }
        return this.discoveryClient;
    }
}
