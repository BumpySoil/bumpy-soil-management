package org.bumpy.soil.web.entity.vo;

import lombok.Data;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 用户
 *
 * @Author: gaojg
 */
@Data
public class UserVO {

    private Integer userId;

    private String userName;

    private String headImg;

    private String nickName;

    private String email;

    private String phone;

    private String roleId;

    private String[] roleIds;

}
