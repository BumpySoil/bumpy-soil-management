package org.bumpy.soil.web.common.aop;

import org.bumpy.soil.web.common.enumeration.CodeEnum;
import org.bumpy.soil.web.entity.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 控制层统一异常增强
 *
 * @Author: bumpy soil
 */
@RestControllerAdvice(basePackages = {"org.bumpy.soil.web.controller"})
public class ControllerExceptionAdvice {

    private static final Logger log = LoggerFactory.getLogger(ControllerExceptionAdvice.class);

    /**
     * 参数错误异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public ResultVO emptyParamExceptionHandler(HttpMessageNotReadableException e) {
        log.error(e.getMessage(), e);
        return new ResultVO(CodeEnum.VALID_ERROR, e.getMessage());
    }

    /**
     * 拦截校验异常
     *
     * @param e
     * @return
     * @ExceptionHandler：用于指定异常处理方法。当与@RestControllerAdvice配合使用时，用于全局处理控制器里的异常。
     */
    @ExceptionHandler({BindException.class})
    public ResultVO methodArgumentNotValidExceptionHandler(BindException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVO(CodeEnum.VALID_ERROR, objectError.getDefaultMessage());
    }

    /**
     * 业务校验异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler({ConstraintViolationException.class})
    public ResultVO constraintViolationExceptionHandler(ConstraintViolationException e) {
        return new ResultVO(CodeEnum.VALID_ERROR, e.getMessage());
    }


    /**
     * 其他异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public ResultVO serverExceptionHandler(Exception e) {
        log.error("服务器错误", e);
        return new ResultVO(CodeEnum.SERVER_ERROR, e.getMessage());
    }

}
