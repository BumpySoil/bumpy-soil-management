package org.bumpy.soil.web.entity.vo.ResultVo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bumpy.soil.web.common.enumeration.CodeEnum;

import java.io.Serializable;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 响应格式
 *
 * @Author: bumpySoil
 */
@Data
@AllArgsConstructor
public class ResultVO<T> implements Serializable {

    private Integer code;

    private String msg;

    private T data;

    public ResultVO(CodeEnum codeEnum, T data) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.data = data;
    }

    public static <T> ResultVO<T> ok(T data) {
        return new ResultVO<T>(CodeEnum.SUCCESS, data);
    }

}
