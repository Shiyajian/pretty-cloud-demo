package com.shiyajian.cloud.pay.service.manager.impl;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.order.feign.OrderClient;
import com.shiyajian.cloud.order.feign.entity.vo.OrderInfoVO;
import com.shiyajian.cloud.pay.pojo.dto.OrderDTO;
import com.shiyajian.cloud.pay.pojo.vo.PayInfoVO;
import com.shiyajian.cloud.pay.service.PayService;
import com.shiyajian.cloud.pay.service.manager.PayServiceManager;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Component
public class PayServiceManagerImpl implements PayServiceManager {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderClient orderClient;


    @Override
    public PayInfoVO payOrder(String orderNo) {

        // 查询订单信息
        ResponseVO<List<OrderInfoVO>> orderInfoResponse = orderClient.getOrderInfoByNo(orderNo);
        if(!orderInfoResponse.getSucceeded()){
            throw new RuntimeException(orderInfoResponse.getMsg());
        }

        // 根据订单信息进行支付，此处使用BeanUtils拷贝属性，是为了远程和本地实体部分不一致情况
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderInfoResponse.getData(),orderDTO);
        payService.saveOrderPay(orderDTO);

        return null;
    }
}
