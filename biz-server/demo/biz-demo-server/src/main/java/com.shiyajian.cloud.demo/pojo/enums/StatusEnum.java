package com.shiyajian.cloud.demo.pojo.enums;

import com.shiyajian.cloud.core.enums.Enumerable;

/**
 * @author shiyajian
 * create: 2019-01-24
 */
public enum StatusEnum implements Enumerable {

    SUCCESS(0, "status.enum"),
    FAILED(1, "status,failed");

    private int value;

    private String key;

    StatusEnum(int value, String key) {
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
    }}
