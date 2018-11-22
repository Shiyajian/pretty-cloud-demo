package com.shiyajian.cloud.pay.service.manager;

import com.shiyajian.cloud.pay.pojo.vo.PayInfoVO;

/** 支付服务聚合类（用来组合本地服务和远程服务的结果，可以配置分布书事务）
 * @author shiyajian
 * create: 2018-10-25
 */
public interface PayServiceManager {


    /** 支付
     * 1、查询订单相关信息（使用feign）
     * 2、对订单进行支付
     * 3、修改订单状态（使用feign）
     * @param orderNo 订单编号
     * @return        支付流水信息
     */
    PayInfoVO payOrder(String orderNo);

    void fileTest();
}
