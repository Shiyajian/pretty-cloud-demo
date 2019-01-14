package com.shiyajian.cloud.core.exception;

import com.shiyajian.cloud.core.entity.ResponseVO;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

/**
 * @author shiyajian
 * create: 2019-01-08
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    // /**
    //  * 所有的业务异常
    //  * @param e 业务异常
    //  * @return
    //  */
    // @ExceptionHandler(ServiceException.class)
    // public ResponseVO<Void> serviceExceptionHandler(ServiceException e) {
    //     ResponseVO<Void> responseVO = new ResponseVO<>();
    //     responseVO.setCode(e.getState().getCode());
    //     responseVO.setMsg(e.getMsg());
    //     return responseVO;
    // }
    //
    // /**
    //  * 参数校验异常
    //  * @param e 校验异常
    //  * @return
    //  */
    // @ExceptionHandler(BindValidationException.class)
    // public ResponseVO<Void> validationExceptionHandler(BindValidationException e) {
    //     ResponseVO<Void> responseVO = new ResponseVO<>();
    //     String errorMsg = e.getValidationErrors()
    //             .getAllErrors()
    //             .stream()
    //             .map(ObjectError::toString)
    //             .collect(Collectors.joining("\n"));
    //     responseVO.setCode(StateCodeEnum.ILLEGAL_ARGUMENT.getCode());
    //     responseVO.setMsg(errorMsg);
    //     return responseVO;
    // }

}
