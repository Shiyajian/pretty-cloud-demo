package com.shiyajian.cloud.global.utils;

import com.shiyajian.cloud.global.entity.PageDTO;
import com.shiyajian.cloud.global.entity.ResponseVO;
import com.shiyajian.cloud.global.enums.ServiceStateEnum;

/**
 * @author shiyajian
 * create: 2018-10-24
 */
@SuppressWarnings({"unchecked"})
public class ResponseVOUtil {

    public static ResponseVO success() {
        return new ResponseVO(ServiceStateEnum.SUCCESS.getCode(),
                ServiceStateEnum.SUCCESS.getMsg(),
                true,
                0L,
                null);
    }

    public static ResponseVO success(Object data) {
        if (data instanceof PageDTO) {
            PageDTO pageDTO = (PageDTO) data;
            return new ResponseVO(ServiceStateEnum.SUCCESS.getCode(),
                    ServiceStateEnum.SUCCESS.getMsg(),
                    true,
                    pageDTO.getTotal(),
                    pageDTO.getData());
        }
        return new ResponseVO(ServiceStateEnum.SUCCESS.getCode(),
                ServiceStateEnum.SUCCESS.getMsg(),
                true,
                0L,
                data);
    }

    public static ResponseVO failed(ServiceStateEnum stateEnum) {
        return new ResponseVO(stateEnum.getCode(),
                stateEnum.getMsg(),
                false,
                0L,
                null);
    }

    public static ResponseVO fallback(Object object) {
        return new ResponseVO(ServiceStateEnum.FALLBACK.getCode(),
                ServiceStateEnum.FALLBACK.getMsg(),
                false,
                0L,
                object);
    }

}
