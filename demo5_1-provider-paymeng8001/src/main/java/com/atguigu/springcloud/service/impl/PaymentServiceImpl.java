package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 风雪壹城
 * Date Create in 2021/8/10 11:10
 * Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Integer create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return new Payment();
        //return paymentMapper.getPaymentById(id);
    }
}
