package com.shiyajian.cloud.demo.exception;

import com.shiyajian.cloud.core.exception.UnauthorizedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author shiyajian
 * create: 2019-01-09
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

    /**
     * 所有精确的异常无法捕获，最后通过此异常捕获，然后计入日志文件，等待升级时候，增加对应的处理操作
     * @param e 所有精确异常无法捕获的异常
     * @return 返回给前台的响应实体，会被Jackson序列化成json
     */
    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity unknownExceptionHandler(Throwable e) {
        e.printStackTrace();
        log.debug("发生了异常", e);
        return ResponseEntity.ok(null);
    }

    /**
     * 参数校验不通过异常处理
     * @param e validation 校验异常
     * @return 返回给前台的响应实体，会被Jackson序列化成json
     */
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> validationExceptionHandler(BindException e) {
        List<FieldError> fieldErrors = e.getFieldErrors();
        String errorMsg = fieldErrors.stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining("\n"));
        return ResponseEntity.of(Optional.of(errorMsg));
    }

    /**
     * 未登录，返回状态403，前台接受到此状态弹出/跳转到登录页面
     * @param e 没有权限异常
     */
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public void unauthorizedExceptionHandler(UnauthorizedException e) {
    }

}
