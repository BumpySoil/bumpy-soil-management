package org.bumpy.soil.web.entity.vo;

import lombok.Data;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 菜单
 *
 * @Author: bumpy soil
 */
@Data
public class MenuVO {

    private Integer menuId;

    private String menuName;

    private Integer parentId;

    private String path;

    private String component;

    private String icon;

    private Boolean keepAlive;

    private Integer sort;

    private Boolean hidden;

    private Boolean closeTab;

}
