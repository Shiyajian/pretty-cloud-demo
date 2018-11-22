package com.shiyajian.cloud.pay.client;

import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.pay.PayClient;
import com.shiyajian.cloud.pay.client.entity.param.ScanPayParam;
import com.shiyajian.cloud.pay.client.entity.vo.ScanPayVO;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供给外部服务的实现类
 * 参数、方法名、请求路径等应该一致
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@RestController
public class PayClientImpl implements PayClient {


    @Override
    public ResponseVO<ScanPayVO> scanPay(ScanPayParam payParam) {
        return null;
    }
}
