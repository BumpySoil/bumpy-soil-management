package org.bumpy.soil.web.entity.vo;

import lombok.Data;

/**
 * Copyright (C), 2022-2023, 土克拉
 * Description: 验证码
 *
 * @Author: gaojg
 */
@Data
public class CaptchaVO {

    private String captchaId;

    private String picBase64;

    private String captchaLength;

}
