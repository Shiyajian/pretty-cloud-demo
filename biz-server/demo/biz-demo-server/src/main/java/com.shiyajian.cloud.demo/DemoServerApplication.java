package com.shiyajian.cloud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author shiyajian
 * create: 2018-11-20
 */
@SpringCloudApplication
@MapperScan("com.shiyajian.cloud.demo.dao")
public class DemoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerApplication.class);
    }
}
