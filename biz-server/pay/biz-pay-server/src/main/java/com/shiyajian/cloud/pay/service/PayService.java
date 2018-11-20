package com.shiyajian.cloud.pay.service;

import com.shiyajian.cloud.pay.pojo.dto.OrderDTO;

/**
 * 支付服务类
 * @author shiyajian
 * create: 2018-10-25
 */
public interface PayService {


    /**
     * 支付订单（save开头是为了匹配声明式事务规则）
     * @param orderDTO   待支付订单相关信息
     */
    void saveOrderPay(OrderDTO orderDTO);
}
