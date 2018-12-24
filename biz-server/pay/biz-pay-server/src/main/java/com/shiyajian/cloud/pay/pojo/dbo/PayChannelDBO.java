package com.shiyajian.cloud.pay.pojo.dbo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.shiyajian.cloud.pay.pojo.enums.ChannelTypeEnum;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-12-24
 */
@Data
@TableName("t_pay_channel")
public class PayChannelDBO {

    private String id;

    private String name;

    private ChannelTypeEnum type;
}
