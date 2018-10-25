package com.shiyajian.cloud.pay.pojo.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class ProductDTO {

    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private BigDecimal productPrice;

    /**
     * 数量
     */
    private Integer quantity;
}
