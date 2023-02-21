package org.bumpy.soil.web.entity.dto;

import lombok.Data;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 角色
 *
 * @Author: bumpy soil
 */
@Data
public class RoleDTO {

    private Integer roleId;

    private String roleName;

    private String parentId;

    private String remark;

}
