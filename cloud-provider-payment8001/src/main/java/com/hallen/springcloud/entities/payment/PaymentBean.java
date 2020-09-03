package com.hallen.springcloud.entities.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: PaymentBean
 * @Description: TODO
 * @Author: Hallen
 * @Date: 2020/9/2 17:51
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentBean {
    private long id;
    private String serial;
}
