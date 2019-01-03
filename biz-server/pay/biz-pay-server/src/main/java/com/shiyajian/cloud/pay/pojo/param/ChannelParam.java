package com.shiyajian.cloud.pay.pojo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

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
