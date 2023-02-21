package org.bumpy.soil.web.entity.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 用户
 *
 * @Author: bumpySoil
 */
@Data
public class RegisterDTO extends LoginDTO implements Serializable {

    @Email
    private String email;

    @Pattern(regexp = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))" +
            "\\d{8}$", message = "手机号码范围不正确")
    private String phone;

}
