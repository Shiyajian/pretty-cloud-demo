package com.shiyajian.cloud.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiyajian
 * create: 2018-12-18
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/hello")
    public String helloOrder(){
        return "hello order";
    }
}
