package com.shiyajian.cloud.file;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author shiyajian
 * create: 2018-11-20
 */
@SpringCloudApplication
@EnableFeignClients
public class FileServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FileServerApplication.class);
    }
}
