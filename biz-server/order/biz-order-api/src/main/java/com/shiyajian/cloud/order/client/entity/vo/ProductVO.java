package com.shiyajian.cloud.order.client.entity.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 产品
 *
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 7368697961669616L;

    /** 产品编号 */
    private String productNo;

    /** 产品名称 */
    private String productName;

    /** 产品价格 */
    private BigDecimal productPrice;

    /** 数量 */
    private Integer quantity;

}
