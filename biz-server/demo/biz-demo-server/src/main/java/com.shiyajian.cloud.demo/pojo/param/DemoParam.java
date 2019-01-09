package com.shiyajian.cloud.demo.pojo.param;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author shiyajian
 * create: 2019-01-09
 */
@Data
public class DemoParam {

    @NotNull(message = "valid.demo.id.not-null")
    private String id;

    @NotNull(message = "valid.demo.name.not-null")
    private String name;

    @NotNull(message = "valid.demo.age.not-null")
    @Max(value = 150, message = "valid.demo.age.max")
    @Min(value = 0, message = "valid.demo.age.min")
    private int age;
}
