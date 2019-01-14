package com.shiyajian.cloud.demo.exception;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

/**
 * @author shiyajian
 * create: 2019-01-10
 */
@ControllerAdvice
public class StringTrimAdvice implements WebBindingInitializer {

    /**
     * 注册一个转换器，前台请求的参数自动trim，如果前台必须保留空格，前后空格请用%20转移
     * @param webDataBinder 数据绑定器
     */
    @Override
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
    }
}
