/*
 * Copyright 2022 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.mavencommandlineparaspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2022/7/28
 **/
@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/appName")
    public String appName() {
        return appName;
    }
}
