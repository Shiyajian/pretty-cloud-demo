package com.shiyajian.cloud.pay.pojo.po;

import lombok.Data;

import java.math.BigDecimal;

/** 账号对应数据库实体对象
 * @author shiyajian
 * create: 2018-10-25
 */
@Data
public class AccountPO {

    private String accountId;

    private BigDecimal money;
}
