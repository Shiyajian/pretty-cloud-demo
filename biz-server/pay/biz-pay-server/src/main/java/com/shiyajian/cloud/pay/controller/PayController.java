package com.shiyajian.cloud.pay.controller;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.global.utils.ResponseVOUtil;
import com.shiyajian.cloud.pay.pojo.AliPayRequest;
import com.shiyajian.cloud.pay.pojo.WechatPayRequest;
import com.shiyajian.cloud.pay.pojo.vo.PayInfoVO;
import com.shiyajian.cloud.pay.service.manager.PayServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/** 支付控制类
 * @author shiyajian
 * create: 2018-10-25
 */
@RestController
@RequestMapping("pay")
public class PayController {


    @Autowired
    private PayServiceManager payServiceManager;

    @PostMapping("ali")
    public void aliPay(@RequestBody AliPayRequest request){

    }

    @PostMapping("wechat_native")
    public void wechatNativePay(@RequestBody WechatPayRequest request){

    }
    @PostMapping("wechat_js")
    public void wechatJsPay(@RequestBody WechatPayRequest request){

    }

    /** 支付订单
     * @param orderNo 订单编号
     * @return        支付成功流水信息
     */
    @PostMapping("/order/{orderNo}")
    public ResponseVO<Void> payOrder(@PathVariable String orderNo) {
        PayInfoVO payInfoVO = payServiceManager.payOrder(orderNo);
        return ResponseVOUtil.success(payInfoVO);
    }
}
