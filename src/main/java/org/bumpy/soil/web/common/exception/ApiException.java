package org.bumpy.soil.web.common.exception;

import lombok.Getter;
import org.bumpy.soil.web.common.enumeration.CodeEnum;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 接口异常
 *
 * @Author: gaojg
 */
@Getter
public class ApiException extends RuntimeException {

    private Integer code;
    private String msg;

    public ApiException(CodeEnum codeEnum, String msg) {
        super(msg);
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }
}
