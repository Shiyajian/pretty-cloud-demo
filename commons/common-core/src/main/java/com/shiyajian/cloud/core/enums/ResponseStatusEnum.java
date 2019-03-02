package com.shiyajian.cloud.core.enums;

/**
 * 业务返回状态枚举类
 * @author shiyajian
 * create: 2018-10-24
 */
public enum ResponseStatusEnum implements Enumerable {

    /** 请求成功 */
    SUCCESS(20000, "success"),

    /** 未知状态 */
    UNKNOWN(20500, "unknown"),

    /** 错误的请求参数 */
    ILLEGAL_ARGUMENT(20300, "illegal-argument"),

    /** 错误的状态 */
    ILLEGAL_STATE(20200, "illegal-state"),

    /** 没有授权 */
    UNAUTHORIZED(20401, "unauthorized"),

    /** 没找到对应的资源 */
    NOT_FOUND(20404, "not-found"),

    /** 服务熔断降级 */
    FALLBACK(20500, "success");


    /**
     * 枚举类使用到的值
     */
    private int value;

    /**
     * 枚举类对应的文本信息，在国际化文件中对应的 key 值
     */
    private String key;

    ResponseStatusEnum(int value, String key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
