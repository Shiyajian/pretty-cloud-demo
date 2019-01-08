package com.shiyajian.cloud.core.exception;

import lombok.Data;

/**
 * @author shiyajian
 * create: 2019-01-08
 */
@Data
public class ServiceException extends RuntimeException {

    public StateCodeEnum state = StateCodeEnum.ERROR;

    public String msg;

    public ServiceException(String key) {
        this.msg = createI18nExceptionMsg(StateCodeEnum.ERROR, key, null);
    }

    public ServiceException(String key, Object... args) {
        this.msg = createI18nExceptionMsg(StateCodeEnum.ERROR, key, args);
    }

    public ServiceException(StateCodeEnum stateCodeEnum, String key) {
        this.state = stateCodeEnum;
        this.msg = createI18nExceptionMsg(stateCodeEnum, key, null);
    }

    public ServiceException(StateCodeEnum stateCodeEnum, String key, Object... args) {
        this.state = stateCodeEnum;
        this.msg = createI18nExceptionMsg(stateCodeEnum, key, args);
    }

    private String createI18nExceptionMsg(StateCodeEnum stateCodeEnum, String key, Object... args) {
        return null;
    }

}
