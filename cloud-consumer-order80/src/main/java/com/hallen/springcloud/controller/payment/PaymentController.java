package com.hallen.springcloud.controller.payment;

import com.hallen.springcloud.entities.payment.PaymentBean;
import com.hallen.springcloud.entities.result.CommonResult;
import com.hallen.springcloud.service.payment.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/3 12:18
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    PaymentService service;

    @GetMapping("getPayment")
    public CommonResult<PaymentBean> getOrder(@RequestParam("id")String id){
        try {
            PaymentBean result = service.getOrder(id);
            return result == null || result.getId() == null ? new CommonResult<>("1001","没有该笔订单") : new CommonResult<>("0000","success",result);
        }catch (Exception e){
            log.error("获取订单异常："+e);
            return new CommonResult<>("9999","系统异常");
        }
    }



}
