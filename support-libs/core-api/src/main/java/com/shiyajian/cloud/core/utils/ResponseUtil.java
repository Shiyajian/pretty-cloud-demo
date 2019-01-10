package com.shiyajian.cloud.core.utils;

import com.shiyajian.cloud.core.entity.PageDTO;
import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.enums.ServiceStateEnum;

import java.util.List;

/**
 * @author shiyajian
 * create: 2018-10-24
 */
public class ResponseUtil {

    private ResponseUtil() { /* no instance */ }

    public static <T> ResponseVO<T> success() {
        return new ResponseVO<>(ServiceStateEnum.SUCCESS.getCode(),
                ServiceStateEnum.SUCCESS.getMsg(),
                true,
                0L,
                null);
    }

    public static <T> ResponseVO<T> success(T data) {
        return new ResponseVO<>(ServiceStateEnum.SUCCESS.getCode(),
                ServiceStateEnum.SUCCESS.getMsg(),
                true,
                0L,
                data);
    }

    public static <T> ResponseVO<List<T>> success(PageDTO<T> data) {
        return new ResponseVO<>(ServiceStateEnum.SUCCESS.getCode(),
                ServiceStateEnum.SUCCESS.getMsg(),
                true,
                data.getTotal(),
                data.getData());
    }

    public static <T> ResponseVO<T> failed(ServiceStateEnum stateEnum) {
        return new ResponseVO<>(stateEnum.getCode(),
                stateEnum.getMsg(),
                false,
                0L,
                null);
    }

    public static <T> ResponseVO fallback(T object) {
        return new ResponseVO<>(ServiceStateEnum.FALLBACK.getCode(),
                ServiceStateEnum.FALLBACK.getMsg(),
                false,
                0L,
                object);
    }

}
