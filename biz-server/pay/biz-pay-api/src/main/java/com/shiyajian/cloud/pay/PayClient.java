package com.shiyajian.cloud.pay;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.pay.client.entity.param.ScanPayParam;
import com.shiyajian.cloud.pay.client.entity.vo.ScanPayVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author shiyajian
 * create: 2018-10-24
 */
@FeignClient(value = "biz-pay-server")
public interface PayClient {

    @PostMapping("/pay/scan")
    ResponseVO<ScanPayVO> scanPay(@RequestBody ScanPayParam payParam);
}
