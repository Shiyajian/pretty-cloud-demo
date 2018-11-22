package com.shiyajian.cloud.global;

/**
 * 总架构通用约定
 * 参考国家标准
 * @see {http://www.gb688.cn/bzgk/gb/}
 * @author shiyajian
 * create: 2018-11-17
 */
public class Global {

    private Global() {
        //no instance
    }

    /**
     * 全局常量
     */
    public static class Const {
        public static final String PROJECT_NAME = "cobweb";
    }

    /**
     * 性别枚举类
     * 标准号：GB/T 2261.1-2003
     */
    public enum GenderEnum {

        UNKNOWN(0, "未知的性别"),
        MALE(1, "男性"),
        FEMALE(2, "女性"),
        UNEXPLAINED(9,"未说明的性别");

        private int key;

        private String value;

        GenderEnum(int key, String value) {
            this.key = key;
            this.value = value;
        }

    }
}
