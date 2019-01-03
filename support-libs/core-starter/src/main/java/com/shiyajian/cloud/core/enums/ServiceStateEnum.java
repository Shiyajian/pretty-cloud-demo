package com.shiyajian.cloud.core.enums;

/**
 * 业务返回状态枚举类
 * @author shiyajian
 * create: 2018-10-24
 */
public enum ServiceStateEnum {

    /** 请求成功 */
    SUCCESS(20000, "success"),

    /** 服务熔断降级 */
    FALLBACK(20500, "success");


    private int code;

    private String msg;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ServiceStateEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
