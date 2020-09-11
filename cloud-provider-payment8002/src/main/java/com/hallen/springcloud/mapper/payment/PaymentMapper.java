package com.hallen.springcloud.mapper.payment;

import com.hallen.springcloud.entities.payment.PaymentBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentMapper
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 18:00
 * @Version: 1.0
 */
@Mapper
public interface PaymentMapper {
    public int create(PaymentBean paymentBean);
    public PaymentBean getPaymentById(@Param("id") Long id);
}
