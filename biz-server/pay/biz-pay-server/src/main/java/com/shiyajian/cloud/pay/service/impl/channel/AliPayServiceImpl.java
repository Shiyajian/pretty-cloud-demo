package com.shiyajian.cloud.pay.service.impl.channel;

import com.shiyajian.cloud.pay.service.PayableService;
import org.springframework.stereotype.Service;

/**
 * @author shiyajian
 * create: 2018-12-28
 */
// 每个实现类，在spring中对应一个bean ,bean的 name 默认是 类名加小写
// @Service("aliPayServiceImpl")
@Service // 不写等同于上方
public class AliPayServiceImpl implements PayableService {
    @Override
    public void doPay() {

    }

    @Override
    public void doRefund() {

    }

    @Override
    public void doCash() {

    }
}
