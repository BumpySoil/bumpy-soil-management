package org.bumpy.soil.web.common.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bumpy.soil.web.common.annotation.NotResponseAdvice;
import org.bumpy.soil.web.common.enumeration.CodeEnum;
import org.bumpy.soil.web.common.exception.ApiException;
import org.bumpy.soil.web.entity.vo.ResultVO;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 统一响应格式
 *
 * @Author: bumpy soil
 */
@RestControllerAdvice(basePackages = {"org.bumpy.soil.web.controller"})
public class ControllerResponseAdvice implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return !(returnType.getParameterType().isAssignableFrom(ResultVO.class)
                || returnType.hasMethodAnnotation(NotResponseAdvice.class));
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<?
            extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {
        if (returnType.getGenericParameterType().equals(String.class)) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // 将数据包装在ResultVo里后转换为json串进行返回
                return objectMapper.writeValueAsString(ResultVO.ok(body));
            } catch (JsonProcessingException e) {
                throw new ApiException(CodeEnum.SERVER_ERROR, e.getMessage());
            }
        }
        // 否则直接包装成ResultVo返回
        return ResultVO.ok(body);
    }
}
