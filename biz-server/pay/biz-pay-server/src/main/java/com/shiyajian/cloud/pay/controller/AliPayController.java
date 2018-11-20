package com.shiyajian.cloud.pay.controller;

import com.shiyajian.cloud.global.entity.ResponseVO;
import org.springframework.web.bind.annotation.RestController;

/**
 * 支付宝支付
 * @author shiyajian
 * create: 2018-11-05
 */
@RestController("ali")
public class AliPayController {

    ResponseVO<Void> doAliPay(){
        return null;
    }
}
