package com.shiyajian.cloud.demo.pojo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author shiyajian
 * create: 2019-01-10
 */
@Data
public class TrimParam {

    @NotNull
    private String name;
}
