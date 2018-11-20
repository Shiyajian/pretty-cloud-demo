package com.shiyajian.cloud.pay.service.impl;

import com.shiyajian.cloud.pay.pojo.dto.OrderDTO;
import com.shiyajian.cloud.pay.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Service
public class PayServiceImpl implements PayService {


    @Override
    public void saveOrderPay(OrderDTO orderDTO) {
        // 查询账户余额是否充足

        // 加锁扣款

        // 保存支付记录

        // 返回支付记录
    }
}
