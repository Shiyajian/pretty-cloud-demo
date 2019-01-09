package com.shiyajian.cloud.demo.exception;

import com.shiyajian.cloud.core.entity.ResponseVO;
import com.shiyajian.cloud.core.enums.ServiceStateEnum;
import com.shiyajian.cloud.core.utils.ResponseVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shiyajian
 * create: 2019-01-09
 */
@RestControllerAdvice
public class ControllerExceptionHandler {


    @Autowired
    private MessageSource messageSource;

    /**
     * 所有精确的异常无法捕获，最后通过此异常捕获，然后计入日志文件，等待升级时候，增加对应的处理操作
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResponseVO unknownExceptionHandler(Exception e) {
        System.out.println("发生了未知的异常");
        return ResponseVOUtil.failed(ServiceStateEnum.UNKNOWN);
    }

    /**
     * 参数校验不通过异常处理
     * @param e validation 校验异常
     * @return             响应给前端的错误json信息
     */
    @ExceptionHandler(BindException.class)
    public ResponseVO validationExceptionHandler(BindException e) {
        List<FieldError> fieldErrors = e.getFieldErrors();
        String errorMsg = fieldErrors.stream()
                .map(item -> getErrorMsgByKey(item.getDefaultMessage()))
                .collect(Collectors.joining("\n"));
        ResponseVO response = new ResponseVO();
        response.setCode(ServiceStateEnum.ILLEGAL_ARGUMENT.getCode());
        response.setMsg(ServiceStateEnum.ILLEGAL_ARGUMENT.getMsg());
        response.setDetailMsg(errorMsg);
        return response;
    }

    private String getErrorMsgByKey(String key) {
        return messageSource.getMessage(key,null, LocaleContextHolder.getLocale());
    }
}
