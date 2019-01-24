package com.shiyajian.cloud.pay.pojo.dbo;

import com.shiyajian.cloud.pay.pojo.enums.ChannelTypeEnum;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-12-24
 */
@Data
public class PayChannelDBO {

    /**
     * 支付渠道id
     */
    private String id;

    /**
     * 渠道名称
     */
    private String name;

    /**
     * 渠道类型
     */
    private ChannelTypeEnum type;

    /**
     * 支持付款
     */
    private Boolean payable;

    /**
     * 支持退款
     */
    private Boolean refundable;
}
