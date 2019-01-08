package com.shiyajian.cloud.core;

/**
 * 总架构通用约定
 * 参考国家标准
 * @author shiyajian
 * create: 2018-11-17
 * @see {http://www.gb688.cn/bzgk/gb/}
 */
public class Global {

    private Global() { /* no instance */ }

    /**
     * 性别枚举类
     * 标准号：GB/T 2261.1-2003
     */
    public enum GenderEnum {

        /** 未知 */
        UNKNOWN(0, "unknown", "未知的性别"),

        /** 男 */
        MALE(1, "male", "男性"),

        /** 女 */
        FEMALE(2, "female", "女性"),

        /** 未说明 */
        UNEXPLAINED(9, "unexplained", "未说明的性别");

        private int value;

        private String key;

        private String description;

        GenderEnum(int value, String key, String description) {
            this.value = value;
            this.key = key;
            this.description = description;
        }
    }

    public enum WeekEnum {

    }

    /**
     * 全局常量
     */
    public static class Const {

        public static final String PROJECT_NAME = "cobweb";

        private Const() { /* no instance */ }

    }

}
