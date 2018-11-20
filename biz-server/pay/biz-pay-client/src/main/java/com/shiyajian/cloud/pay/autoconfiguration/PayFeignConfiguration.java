package com.shiyajian.cloud.pay.autoconfiguration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * 将feignClient做成启动类，防止引用者忘记加包扫描而报错
 * 在启动时候将带有注解的FeignClient注解的类扫描到spring容器中
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@Configuration
@EnableFeignClients("com.shiyajian.cloud.pay.feign")
public class PayFeignConfiguration {
}
