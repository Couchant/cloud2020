package com.hallen.springcloud.controller.payment;

import com.hallen.springcloud.entities.payment.PaymentBean;
import com.hallen.springcloud.entities.result.CommonResult;
import com.hallen.springcloud.service.payment.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 18:30
 * @Version: 1.0
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    PaymentService service;

    @PostMapping("insert")
    public CommonResult insert(PaymentBean paymentBean){
        log.info(paymentBean.toString());
        log.debug(paymentBean.toString());
        try {
            Integer result = service.insert(paymentBean);
            return result == 0 ? new CommonResult("1001","业务处理失败") : new CommonResult("0000","success");
        }catch (Exception e){
            log.error("插入订单流水失败："+paymentBean.toString());
            return new CommonResult("9999","系统异常");
        }
    }

    @GetMapping("queryPayment")
    public CommonResult<PaymentBean> queryPayment(Long id){
        log.info(id.toString());
        try {
            PaymentBean paymentBean = service.queryPayment(id);
            return paymentBean ==null || StringUtils.isEmpty(paymentBean.getId()) ? new CommonResult<PaymentBean>("1001","没有该笔订单") : new CommonResult<PaymentBean>("0000","success",paymentBean);
        }catch (Exception e){
            log.error("插入订单流水失败："+id.toString());
            return new CommonResult("9999","系统异常");
        }
    }

}
