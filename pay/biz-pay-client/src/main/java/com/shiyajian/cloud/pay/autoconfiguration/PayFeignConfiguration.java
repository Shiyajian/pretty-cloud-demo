package com.shiyajian.cloud.pay.autoconfiguration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 将feignClient做成启动类，防止引用者忘记加包扫描而报错
 * 在启动时候将带有注解的FeignClient注解的类扫描到spring容器中
 *
 * @author shiyajian
 * create: 2018-10-24
 */
@EnableAutoConfiguration
@EnableFeignClients("com.shiyajian.cloud.pay.feign")
public class PayFeignConfiguration {
}
