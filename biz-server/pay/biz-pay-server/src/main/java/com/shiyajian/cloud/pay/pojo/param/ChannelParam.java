package com.shiyajian.cloud.pay.pojo.param;

import com.sun.istack.internal.NotNull;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-12-25
 */
@Data
public class ChannelParam {

    @NotNull
    private String name;

    @NotNull
    private String icon;

}
