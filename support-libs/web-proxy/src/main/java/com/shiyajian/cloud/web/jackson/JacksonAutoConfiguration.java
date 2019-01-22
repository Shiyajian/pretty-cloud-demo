package com.shiyajian.cloud.web.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.google.common.collect.ImmutableList;
import com.shiyajian.cloud.core.enums.Enumerable;
import com.shiyajian.cloud.web.properties.WebProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;

/**
 * jackson的配置规则可以通过xml也可以通过代码，
 * 但是因为jackson的规则一旦修改，我们就基本不会再修改，所以硬编码可以带来好处
 * 第一：避免误改yml文件导致配置出错
 * 第二：减少yml文件中的内容，让阅读更加轻松方便
 * @author shiyajian
 * create: 2019-01-10
 */
@Configuration
@Slf4j
public class JacksonAutoConfiguration {

    @Bean
    @Primary
    @ConditionalOnMissingBean(HttpMessageConverter.class)
    public MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter() {
        log.info("123");
        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = converter.getObjectMapper();
        SimpleModule customerModule = new SimpleModule();

        // 修改String.class 反序列方法，当前端传来的数据（body中）,将数据转换成实体时候，对所有String类型的就行trim
        customerModule.addDeserializer(String.class, new StdDeserializer<String>(String.class) {
            @Override
            public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
                return jsonParser.getValueAsString().trim();
            }
        });

        // 枚举类序列化时候，将key，通过i18n转换成国际化语言，并且带上value一起返回前端
        // 枚举类序列化时候，使用@JsonCreator注解实现
        customerModule.addSerializer(Enumerable.class, new StdSerializer<Enumerable>(Enumerable.class) {
            @Override
            public void serialize(Enumerable enumerable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                // 通过key,在i18n找对应枚举类的描述
                jsonGenerator.writeStartObject();
                jsonGenerator.writeNumberField("value", enumerable.getValue());
                jsonGenerator.writeStringField("description", enumerable.getKey());
                jsonGenerator.writeEndObject();
            }
        });
        objectMapper.registerModule(customerModule);
        converter.setSupportedMediaTypes(ImmutableList.of(MediaType.TEXT_HTML, MediaType.APPLICATION_JSON));
        return converter;
    }

}
