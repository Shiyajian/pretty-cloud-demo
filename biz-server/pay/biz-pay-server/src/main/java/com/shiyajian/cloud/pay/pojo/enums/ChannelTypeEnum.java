package com.shiyajian.cloud.pay.pojo.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shiyajian
 * create: 2018-12-24
 */
// @Getter
public enum ChannelTypeEnum {

    ALIPAY("alipay",0,"支付宝"),

    WECHAT_PAY("wechat_pay",1,"微信支付"),

    ICBC("icbc",2,"");

    private String key;

    private int value;

    private String description;

    ChannelTypeEnum(String key, int value, String description) {
        this.key = key;
        this.value = value;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
