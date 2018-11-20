package com.shiyajian.cloud.pay.pojo.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class OrderDTO {

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
    private List<ProductDTO> products;

    /**
     * 下单时间
     */
    private Date createdTime;
}
