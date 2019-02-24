package com.shiyajian.cloud.gateway.config;

import com.shiyajian.cloud.gateway.filter.JwtCheckGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类（配置类在Application.java之前运行，如果直接把@Bean写在Application.java中 执行晚可能会报错）
 * @author shiyajian
 * create: 2018-12-22
 */
@Configuration
public class GatewayConfiguration {
    @Bean
    public JwtCheckGatewayFilterFactory jwtCheckGatewayFilterFactory() {
        return new JwtCheckGatewayFilterFactory();
    }
}
