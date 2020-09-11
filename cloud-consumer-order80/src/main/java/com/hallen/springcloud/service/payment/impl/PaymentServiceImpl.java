package com.hallen.springcloud.service.payment.impl;

import com.alibaba.fastjson.JSON;
import com.hallen.springcloud.entities.payment.PaymentBean;
import com.hallen.springcloud.entities.result.CommonResult;
import com.hallen.springcloud.service.payment.PaymentService;
import com.hallen.springcloud.service.rest.RestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/3 12:20
 * @Version: 1.0
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

//    public static final String PAYMENT_URL = "http://localhost:8001";
    /**
     * 改为使用服务名访问
     */
    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    RestService restService;
    @Resource
    RestTemplate restTemplate;

    @Override
    public PaymentBean getOrder(String id) {
        CommonResult<PaymentBean> result = restTemplate.getForObject(PAYMENT_URL + "/payment/queryPayment"+"?id={id}", CommonResult.class, id);
        log.debug("本次rest请求返回结果为："+ JSON.toJSON(result));
        if (result!=null&&result.getCode().equals("0000")){
            log.debug("data:"+result.getData());
            return JSON.toJavaObject((JSON) JSON.toJSON(result.getData()),PaymentBean.class);
        }
        return null;
    }

    @Override
    public Integer createOrder(String serial) {
        PaymentBean paymentBean = new PaymentBean();
        paymentBean.setSerial(serial);
        CommonResult<Integer> result = restTemplate.postForObject(PAYMENT_URL+"/payment/insert",paymentBean,CommonResult.class);
        log.debug("本次rest请求返回结果为："+ JSON.toJSON(result));
        if (result!=null&&result.getCode().equals("0000")){
            log.debug("data:"+result.getData());
            return result.getData();
        }
        return 0;
    }
}
