package com.shiyajian.cloud.pay.pojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2018-11-05
 */
@Data
public class AliPayConfigDTO {

    /**
     * 支付宝分配给开发者的应用ID(必须)
     */
    @JsonProperty("app_id")
    private String appId;

    /**
     * 私钥(必须)
     */
    @JsonProperty("private_key")
    private String privateKey;

    /**
     * 公钥(必须)
     */
    @JsonProperty("public_key")
    private String publicKey;

    /**
     * 签名类型(必须)
     *
     * @see com.alipay.api.AlipayConstants#SIGN_TYPE_RSA
     * @see com.alipay.api.AlipayConstants#SIGN_TYPE_RSA2
     */
    @JsonProperty("sign_type")
    private String signType;

    /**
     * 通知地址(必须)
     */
    @JsonProperty("notify_url")
    private String notifyUrl;

    /**
     * 同步地址
     */
    @JsonProperty("return_url")
    private String returnUrl;

    @JsonProperty("sandbox")
    private boolean sandbox;

}

