package org.bumpy.soil.web.entity.dto;

import lombok.Data;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 用户
 *
 * @Author: bumpy soil
 */
@Data
public class UserDTO {

    private Integer userId;

    private String userName;

    private String password;

    private String nickName;

    private String email;

    private String phone;

}
