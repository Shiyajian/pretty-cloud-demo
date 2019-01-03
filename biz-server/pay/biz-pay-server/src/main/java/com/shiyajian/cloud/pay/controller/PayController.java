package com.shiyajian.cloud.pay.controller;

import com.shiyajian.cloud.pay.constants.PayConstants;
import com.shiyajian.cloud.pay.pojo.AliPayRequest;
import com.shiyajian.cloud.pay.pojo.WechatPayRequest;
import com.shiyajian.cloud.pay.service.PayableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * 支付控制器
 * @author shiyajian
 * create: 2018-10-25
 */
@RestController
@RequestMapping("/pay/")
public class PayController {
    // 如果只有一个实现类，这个变量叫不管叫什么名字，都找那一个实现类
    // @Autowired
    // PayableService payableService;

    // 如果有多个实现类，把变量名字改成 spring 的 bean的 name就能找到
    @Autowired
    PayableService wechatPayServiceImpl;

    @Autowired
    // @Qualifier("aliPayServiceImpl")  或者用这个注解指定
    PayableService aliPayServiceImpl;


    @PostMapping(value = "/{orderNo}", params = {"type=" + PayConstants.Channel.ALIPAY})
    public void aliPay(@PathVariable("orderNo") String orderNo,
                       @RequestBody AliPayRequest request) {

    }



}
