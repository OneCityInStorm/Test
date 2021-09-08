package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 风雪壹城
 * Date Create in 2021/8/10 10:33
 * Description:
 */
@Mapper
public interface PaymentMapper {
   public Integer create(Payment payment);
   public Payment getPaymentById(@Param("id") Long id);
}
