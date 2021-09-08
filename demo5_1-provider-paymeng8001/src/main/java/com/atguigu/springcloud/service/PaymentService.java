package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 风雪壹城
 * Date Create in 2021/8/10 11:08
 * Description:
 */
@Mapper
public interface PaymentService {
    public Integer create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
