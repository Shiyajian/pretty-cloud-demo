package com.shiyajian.cloud.demo.controller;

import com.shiyajian.cloud.core.exception.UnauthorizedException;
import com.shiyajian.cloud.demo.pojo.param.DemoParam;
import com.shiyajian.cloud.demo.pojo.param.EnumParam;
import com.shiyajian.cloud.demo.pojo.param.TrimParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author shiyajian
 * create: 2019-01-09
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

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
    public EnumParam getEnum(@Valid @RequestBody EnumParam enumParam) {
        return enumParam;
    }
}
