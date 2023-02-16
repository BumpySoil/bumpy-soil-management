package org.bumpy.soil.web.common.enumeration;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description:
 *
 * @Author: bumpySoil
 */
public enum CodeEnum {

    SUCCESS(200, "处理成功"),
    CLIENT_ERROR(400, "客户端错误"),
    VALID_ERROR(4001, "校验失败"),
    SERVER_ERROR(500, "服务端错误");

    private Integer code;

    private String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
