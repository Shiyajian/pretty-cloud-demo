package com.shiyajian.cloud.core.exception.status;

/**
 * @author shiyajian
 * create: 2019-01-08
 */
public enum StateCodeEnum {

    /**
     * 业务异常错误，default
     */
    ERROR(20500),

    /**
     * 错误的请求参数
     */
    ILLEGAL_ARGUMENT(20300),

    /**
     * 错误的状态
     */
    ILLEGAL_STATE(20200),

    /**
     * 没找到对应的资源
     */
    NOT_FOUND(20400);

    private int code;

    StateCodeEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
