package com.shiyajian.cloud.order.client.entity.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单信息
 *
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class OrderInfoVO implements Serializable {

    private static final long serialVersionUID = 7368697961669616L;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 下单用户ID
     */
    private String userId;

    /**
     * 产品列表
     */
    private List<ProductVO> products;

    /**
     * 下单时间
     */
    private Date createdTime;
}
