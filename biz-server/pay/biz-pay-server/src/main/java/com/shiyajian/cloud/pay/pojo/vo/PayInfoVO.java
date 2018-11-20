package com.shiyajian.cloud.pay.pojo.vo;

import lombok.Data;

/** 支付流水信息
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class PayInfoVO {

    /**
     * 支付流水信息id
     */
    private String payId;

    /**
     * 支付流水单号
     */
    private String payNO;

}
