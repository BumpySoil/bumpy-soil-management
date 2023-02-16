package org.bumpy.soil.web.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 不进行响应增强的注解
 *
 * @Author: bumpySoil
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotResponseAdvice {
}
