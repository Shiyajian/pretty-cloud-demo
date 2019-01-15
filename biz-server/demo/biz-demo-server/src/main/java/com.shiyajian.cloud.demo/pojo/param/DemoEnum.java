package com.shiyajian.cloud.demo.pojo.param;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author shiyajian
 * create: 2019-01-12
 */
public enum DemoEnum implements Enumable {

    HELLO("enum.demo.hello", 1),

    WORLD("enum.demo.world", 2);

    /**
     * i18n 国际化文件中对应的key,在序列化返回给前台时候，通过i18n文件，转换成对应的描述
     */
    private String key;

    /**
     * 数据库中保存的value值
     */
    private int value;

    DemoEnum(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    /**
     * 此处不能使用 valueOf命名，不然的话，可能根据ordinal获得值，引发数据错位
     * @param value
     * @return
     */
    @JsonCreator
    public static DemoEnum get(Integer value) {

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
}
