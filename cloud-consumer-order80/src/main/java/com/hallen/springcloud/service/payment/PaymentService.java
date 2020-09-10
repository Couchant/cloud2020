package com.hallen.springcloud.service.payment;

import com.hallen.springcloud.entities.payment.PaymentBean;

/**
 * @ClassName: PaymentService
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/3 12:20
 * @Version: 1.0
 */
public interface PaymentService {
    PaymentBean getOrder(String id);

    Integer createOrder(String serial);
}
