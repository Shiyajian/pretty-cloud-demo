package com.shiyajian.cloud.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shiyajian.cloud.core.utils.JsonUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * jackson的配置规则可以通过xml也可以通过代码，
 * 但是因为jackson的规则一旦修改，我们就基本不会再修改，所以硬编码可以带来好处
 * 第一：避免误改yml文件导致配置出错
 * 第二：减少yml文件中的内容，让阅读更加轻松方便
 * @author shiyajian
 * create: 2019-01-10
 */
@Configuration
public class JacksonConfig {

    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        return JsonUtil.jsonMapperInstance();
    }

}
