package com.hallen.springcloud.service.payment;

import com.hallen.springcloud.entities.payment.PaymentBean;

/**
 * @ClassName: PaymentService
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 18:31
 * @Version: 1.0
 */
public interface PaymentService {
    Integer insert(PaymentBean paymentBean);

    PaymentBean queryPayment(Long id);
}
