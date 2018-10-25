package com.shiyajian.cloud.pay.feign;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.pay.feign.entity.param.ScanPayParam;
import com.shiyajian.cloud.pay.feign.entity.vo.ScanPayVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供给外部服务的实现类
 * 参数、方法名、请求路径等应该一致
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@RestController
@RequestMapping("pay")
public class PayClientImpl implements PayClient {


    @Override
    public ResponseVO<ScanPayVO> scanPay(ScanPayParam payParam) {
        return null;
    }
}
