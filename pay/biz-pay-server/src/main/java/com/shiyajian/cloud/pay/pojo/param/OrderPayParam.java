package com.shiyajian.cloud.pay.pojo.param;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class OrderPayParam {

    @JsonProperty("order_no")
    private String orderNo;

}
