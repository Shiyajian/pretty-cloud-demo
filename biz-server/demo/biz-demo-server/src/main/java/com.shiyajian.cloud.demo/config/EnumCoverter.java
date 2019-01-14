package com.shiyajian.cloud.demo.config;

import com.shiyajian.cloud.demo.pojo.param.DemoEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author shiyajian
 * create: 2019-01-12
 */
@Component
public class EnumCoverter implements Converter<String, DemoEnum> {
    @Override
    public DemoEnum convert(String key) {
        return DemoEnum.valueOf(Integer.valueOf(key));
    }
}
