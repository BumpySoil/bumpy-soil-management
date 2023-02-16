package org.bumpy.soil.web.entity.vo.ResultVo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 登录VO
 *
 * @Author: gaojg
 */
@Data
public class LoginVO implements Serializable {

    @NotNull(message = "用户名不能为空")
    private String userName;

    @NotNull(message = "密码不能为空")
    private String password;

}
