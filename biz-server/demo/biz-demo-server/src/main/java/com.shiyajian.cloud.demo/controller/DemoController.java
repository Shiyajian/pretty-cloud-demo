package com.shiyajian.cloud.demo.controller;

import com.shiyajian.cloud.demo.pojo.param.DemoParam;
import com.shiyajian.cloud.demo.pojo.param.TrimParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
