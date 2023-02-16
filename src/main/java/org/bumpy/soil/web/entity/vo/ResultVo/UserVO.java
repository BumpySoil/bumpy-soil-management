package org.bumpy.soil.web.entity.vo.ResultVo;

import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 用户
 *
 * @Author: bumpySoil
 */
@Data
public class UserVO implements Serializable {

    private String userName;

    private String password;

    private String email;

    private String phone;

}
