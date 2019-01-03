package com.shiyajian.cloud.pay.service;

/**
 * @author shiyajian
 * create: 2018-12-26
 */
public interface PayableService {

     void doPay();

     void doRefund();

     void doCash();
}
