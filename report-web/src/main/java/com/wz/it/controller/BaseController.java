package com.wz.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基类控制器
 *
 * @author zhaowangquan
 * @since 2021/12/14 5:16 下午
 */
@RestController
@RequestMapping(value = "/")
public class BaseController {

    @RequestMapping(value = "heartbeat")
    public String heartbeat() {
        return "success";
    }
}
