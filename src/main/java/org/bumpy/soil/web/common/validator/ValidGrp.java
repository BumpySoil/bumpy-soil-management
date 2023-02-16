package org.bumpy.soil.web.common.validator;

import javax.validation.groups.Default;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 校验分组
 *
 * @Author: bumpySoil
 */
public class ValidGrp {

    public interface Insert extends Default {
    }

    public interface Update extends Default {
    }

    public interface Query extends Default {

    }

    public interface Login extends Default {

    }

}
