package com.shiyajian.cloud.demo.pojo.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author shiyajian
 * create: 2019-01-12
 */
@Data
public class EnumParam {

    @NotNull
    private DemoEnum demoEnum;

    private String id;

    private String name;


}
