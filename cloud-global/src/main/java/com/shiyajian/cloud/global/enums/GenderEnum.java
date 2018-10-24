package com.shiyajian.cloud.global.enums;

/**
 * 性别枚举类
 *
 * @author shiyajian
 * create: 2018-10-24
 */
public enum GenderEnum {

    /**
     * 未知或者保密
     */
    UNKNOWN(0, "unknown"),

    /**
     * 男士
     */
    MALE(1, "male"),

    /**
     * 女士
     */
    FEMALE(2, "female");

    private int code;

    private String value;

    GenderEnum(int key, String value) {
        this.code = code;
        this.value = value;
    }

}
