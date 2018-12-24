package com.shiyajian.cloud.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author shiyajian
 * create: 2018-10-23
 */
@SpringCloudApplication
@MapperScan("com.shiyajian.cloud.pay.mapper")
public class PayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class);
    }

}
