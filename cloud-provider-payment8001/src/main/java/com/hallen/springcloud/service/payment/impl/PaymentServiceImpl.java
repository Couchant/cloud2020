package com.hallen.springcloud.service.payment.impl;

import com.hallen.springcloud.entities.payment.PaymentBean;
import com.hallen.springcloud.mapper.payment.PaymentMapper;
import com.hallen.springcloud.service.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: PaymentServiceImpl
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 18:32
 * @Version: 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    /**
     * 这里使用@Resource,Mapper类可以使用@Mapper
     * 这里如果使用@Autowired,Mapper类要使用@Component
     */
    @Resource
    PaymentMapper mapper;

    public Integer insert(PaymentBean paymentBean) {
        return mapper.create(paymentBean);
    }

    public PaymentBean queryPayment(Long id) {
        return mapper.getPaymentById(id);
    }
}
