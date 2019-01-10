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

    @NotNull(message = "id不能为空")
    private String id;

    @NotNull(message = "名字不能为空")
    private String name;

    @NotNull(message = "年龄不能为空")
    @Max(value = 150, message = "年能不能超过150")
    @Min(value = 0, message = "年龄必须大于0")
    private int age;
}
