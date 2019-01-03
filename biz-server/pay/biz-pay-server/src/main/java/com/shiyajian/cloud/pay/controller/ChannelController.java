package com.shiyajian.cloud.pay.controller;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.pay.pojo.param.ChannelParam;
import com.shiyajian.cloud.pay.pojo.vo.ChannelVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 支付渠道控制器
 * @author shiyajian
 * create: 2018-12-25
 */
@RequestMapping("/pay/channels/payment")
@RestController
public class ChannelController {

    /**
     * 获得所有的支付渠道
     * @return 所有支付渠道列表
     */
    @GetMapping
    public ResponseVO<List<ChannelVO>> findAllPaymentChannel() {
        System.out.println("pay");
        return null;
    }

    /**
     * 新增一个支付渠道
     * @param param 支付渠道信息
     * @return 保存后的支付渠道信息
     */
    @PostMapping
    public ResponseVO<ChannelVO> addPaymentChannel(@RequestBody ChannelParam param) {
        return null;
    }

    /**
     * 修改一个支付渠道
     * @param channelId 支付渠道id
     * @param param     新的支付渠道信息
     * @return 修改后的支付渠道信息
     */
    @PutMapping("/{channelId}")
    public ResponseVO<ChannelVO> updatePaymentChannel(@PathVariable String channelId, ChannelParam param) {
        return null;
    }

    /**
     * 修改一个支付渠道状态
     * @param channelId 支付渠道id
     * @param status    支付渠道将要变更的状态
     * @return 修改后的支付渠道
     */
    @PatchMapping("/{channelId}")
    public ResponseVO<ChannelVO> updatePaymentChannelStatus(@PathVariable String channelId,
                                                            @RequestParam("status") Integer status) {
        return null;
    }

    /**
     * 删除一个支付渠道
     * @param channelId 支付渠道id
     * @return void
     */
    @DeleteMapping("/{channelId}")
    public ResponseVO<Void> deletePaymentChannel(@PathVariable String channelId) {
        return null;
    }
}
