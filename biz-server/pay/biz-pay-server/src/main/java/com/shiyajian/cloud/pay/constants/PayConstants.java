package com.shiyajian.cloud.pay.constants;

/**
 * @author shiyajian
 * create: 2018-12-26
 */
public class PayConstants {

    private PayConstants() { /* no instance */ }

    /**
     * 支付渠道常量类
     */
    public static class Channel {

        /**
         * 支付宝
         */
        public static final int ALIPAY = 10;

        /**
         * 微信原生
         */
        public static final int WECHAT_NATIVE = 20;

        /**
         * 微信网页支付
         */
        public static final int WECHAT_JS = 21;

        /**
         * 微信app支付
         */
        public static final int WECHAT_APP = 22;

        /**
         * 工商银行
         */
        public static final int ICBC = 30;
    }

}
