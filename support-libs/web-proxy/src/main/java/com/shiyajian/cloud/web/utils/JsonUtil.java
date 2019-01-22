package com.shiyajian.cloud.web.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author shiyajian
 * create: 2019-01-10
 */
@Slf4j
public class JsonUtil {

    private JsonUtil() { /* no instance */ }

    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    static {
        // 通过该方法对mapper对象进行设置，所有序列化的对象都将按改规则进行系列化
        // Include.Include.ALWAYS 默认
        // Include.NON_DEFAULT 属性为默认值不序列化
        // Include.NON_EMPTY 属性为 空（""） 或者为 NULL 都不序列化，则返回的json是没有这个字段的。这样对移动端会更省流量
        // Include.NON_NULL 属性为NULL 不序列化
        JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        JSON_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许出现特殊字符和转义符
        JSON_MAPPER.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        // 允许出现单引号
        JSON_MAPPER.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    }

    public static ObjectMapper jsonMapperInstance() {
        return JSON_MAPPER;
    }

    public static String toJson(Object obj) {
        try {
            return jsonMapperInstance().writeValueAsString(obj);
        } catch (IOException e) {
            log.error(e.toString());
        }
        return null;
    }

    /**
     * 将json string反序列化成对象
     * @param json
     * @param valueType
     * @return
     */
    public static <T> T toObject(String json, Class<T> valueType) {
        try {
            return jsonMapperInstance().readValue(json, valueType);
        } catch (IOException e) {
            log.error(e.toString());
        }
        return null;
    }

    /**
     * 将json array反序列化为对象
     * @param json
     * @param typeReference
     * @return
     */
    public static <T> T toCollection(String json, TypeReference<T> typeReference) {
        try {
            return jsonMapperInstance().readValue(json, typeReference);
        } catch (IOException e) {
            log.error(e.toString());
        }
        return null;
    }
}
