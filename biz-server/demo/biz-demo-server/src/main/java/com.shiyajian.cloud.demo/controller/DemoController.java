package com.shiyajian.cloud.demo.controller;

import com.shiyajian.cloud.core.exception.UnauthorizedException;
import com.shiyajian.cloud.demo.pojo.param.DemoEnum;
import com.shiyajian.cloud.demo.pojo.param.DemoParam;
import com.shiyajian.cloud.demo.pojo.param.EnumParam;
import com.shiyajian.cloud.demo.pojo.param.TrimParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author shiyajian
 * create: 2019-01-09
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Value("${spring.profiles.active}")
    private String env;

    @GetMapping("/get")
    public String getDemo(@Valid DemoParam param) {
        return "demo";
    }

    @GetMapping("/trim")
    public String testTrim(@Valid TrimParam param) {
        return param.getName();
    }

    @PostMapping("/trim/body")
    public String testTrimBody(@RequestBody @Valid TrimParam param) {
        return param.getName();
    }

    @GetMapping("/unauthorized")
    public String unauthorized() {
        throw new UnauthorizedException();
    }

    @GetMapping("/npe")
    public String npe() {
        throw new NullPointerException();
    }

    @PostMapping("/enum")
    public EnumParam postEnum(@Valid @RequestBody EnumParam enumParam) {
        return enumParam;
    }

    @GetMapping("/enum")
    public EnumParam getEnum() {
        EnumParam param = new EnumParam();
        param.setId("123");
        param.setName("hello");
        param.setDemoEnum(DemoEnum.HELLO);
        return param;
    }

    @GetMapping("/profile")
    public String getProfile() {
        return env;
    }
}
