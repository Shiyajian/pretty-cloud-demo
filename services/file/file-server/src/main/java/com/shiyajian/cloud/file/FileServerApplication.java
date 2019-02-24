package com.shiyajian.cloud.file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author shiyajian
 * create: 2018-11-20
 */
@SpringCloudApplication
public class FileServerApplication {

    @Value("env")
    private String env;

    public static void main(String[] args) {
        SpringApplication.run(FileServerApplication.class);
    }
}
