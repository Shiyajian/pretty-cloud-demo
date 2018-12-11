package com.shiyajian.cloud.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shiyajian
 * create: 2018-10-23
 */
@SpringCloudApplication
public class PayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class);
    }

}
