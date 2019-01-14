package com.shiyajian.cloud.demo.pojo.param;

/**
 * @author shiyajian
 * create: 2019-01-12
 */
public enum DemoEnum implements Enumable {

    HELLO("hello", 1),

    WORLD("world", 2);

    private String key;

    private int value;

    DemoEnum(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.getKey();
    }

    @Override
    public int getValue() {
        return this.getValue();
    }

    public static DemoEnum valueOf(Integer value) {

        if (value == null) {
            return null;
        }
        for (DemoEnum demoEnum : DemoEnum.values()) {
            if (demoEnum.getValue() == value) {
                return demoEnum;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }}
