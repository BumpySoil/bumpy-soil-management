package org.bumpy.soil.web.controller;

import org.bumpy.soil.web.entity.vo.ResultVo.LoginVO;
import org.bumpy.soil.web.entity.vo.ResultVo.ResultVO;
import org.bumpy.soil.web.entity.vo.ResultVo.TokenVO;
import org.bumpy.soil.web.entity.vo.ResultVo.UserVO;
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
 * @Author: gaojg
 */
@RestController
@RequestMapping("/anon")
public class AnonController {

    /**
     * 登录
     *
     * @param loginVO
     * @return
     */
    @PostMapping("/login")
    public ResultVO<TokenVO> login(@Validated @RequestBody LoginVO loginVO) {
        TokenVO tokenVO = new TokenVO();
        return ResultVO.ok(tokenVO);
    }

    /**
     * 注册
     *
     * @param userVO
     * @return
     */
    @PostMapping("/register")
    public String register(@Validated @RequestBody UserVO userVO) {

        return "注册成功";
    }

}
