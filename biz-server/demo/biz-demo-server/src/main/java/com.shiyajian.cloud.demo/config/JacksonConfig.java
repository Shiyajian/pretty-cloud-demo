package com.shiyajian.cloud.demo.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.common.collect.ImmutableList;
import com.shiyajian.cloud.core.utils.JsonUtil;
import com.shiyajian.cloud.demo.pojo.param.DemoEnum;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
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
public class JacksonConfig {


    @Primary
    @Bean
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        return JsonUtil.jsonMapperInstance();
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJacksonHttpMessageConverter() {
        final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        ObjectMapper mapper = converter.getObjectMapper();
        SimpleModule customerModule = new SimpleModule();

        // 反序列化时候，对字符串进行trim操作
        customerModule.addDeserializer(String.class, new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
                return jsonParser.getValueAsString().trim();
            }
        });


        // customerModule.addDeserializer(Enumable.class, new JsonDeserializer<Enumable>() {
        //
        //     @Override
        //     public Enumable deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        //         return jsonParser.getIntValue();
        //     }
        // });
        customerModule.addSerializer(DemoEnum.class, new JsonSerializer<DemoEnum>() {
            @Override
            public void serialize(DemoEnum enumable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                // 通过key,在i18n找对应枚举类的描述
                String description = "enum." + enumable.getGroup() + "." + enumable.getKey();
                jsonGenerator.writeStartObject();
                jsonGenerator.writeNumberField("value", enumable.getValue());
                jsonGenerator.writeStringField("description", description);
                jsonGenerator.writeEndObject();
            }
        });
        customerModule.addDeserializer(DemoEnum.class, new JsonDeserializer<DemoEnum>() {

            @Override
            public DemoEnum deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                return DemoEnum.valueOf(Integer.parseInt(jsonParser.getValueAsString()));
            }
        });
        mapper.registerModule(customerModule);


        converter.setSupportedMediaTypes(ImmutableList.of(MediaType.TEXT_HTML, MediaType.APPLICATION_JSON));
        return converter;
    }

}
