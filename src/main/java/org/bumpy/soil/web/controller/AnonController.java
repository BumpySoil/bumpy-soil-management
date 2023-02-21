package org.bumpy.soil.web.controller;

import org.bumpy.soil.web.entity.dto.LoginDTO;
import org.bumpy.soil.web.entity.dto.RegisterDTO;
import org.bumpy.soil.web.entity.vo.CaptchaVO;
import org.bumpy.soil.web.entity.vo.ResultVO;
import org.bumpy.soil.web.entity.vo.TokenVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 不鉴权的接口
 * <p>
 * Copyright (C), 2022-2023, 土克拉
 * Description: 登录控制器
 *
 * @Author: bumpy soil
 */
@RestController
@RequestMapping("/anon")
public class AnonController {

    /**
     * 登录
     *
     * @param loginDTO
     * @return
     */
    @PostMapping("/login")
    public ResultVO<TokenVO> login(@Validated @RequestBody LoginDTO loginDTO) {
        TokenVO tokenVO = new TokenVO();
        return ResultVO.ok(tokenVO);
    }

    /**
     * 注册
     *
     * @param registerVO
     * @return
     */
    @PostMapping("/register")
    public String register(@Validated @RequestBody RegisterDTO registerVO) {

        return "注册成功";
    }

    /**
     * 获取验证码
     *
     * @return
     */
    @PostMapping("/captcha")
    public CaptchaVO captcha() {
        return new CaptchaVO();
    }
}
