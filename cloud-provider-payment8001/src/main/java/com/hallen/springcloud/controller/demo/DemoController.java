package com.hallen.springcloud.controller.demo;

import com.hallen.springcloud.entities.result.CommonResult;
import com.hallen.springcloud.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: DemoController
 * @Description: 实现并测试DEMO
 * @Author: Hallen
 * @Date: 2020/9/12 21:11
 * @Version: 1.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Autowired
    DemoService service;

    /**
     * @Author: Hallen
     * @Description: 服务发现测试方法，返回此时在eureka上的服务注册信息
     * @Param: []
     * @Return: com.hallen.springcloud.entities.result.CommonResult<java.lang.Object>
     * @Date: 2020/9/12 21:33
     */
    @GetMapping("discovery")
    public CommonResult<Object> discovery(){
        Object result = service.getDiscoveryClient();
        return new CommonResult<>("0000","success",result);
    }
}
