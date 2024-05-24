package com.neko.boot.server.controller;

import cn.hutool.core.util.RandomUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gong Zheng
 * @since 2024/5/24 16:36
 */
@Slf4j
@RestController
public class DemoController {

    @GetMapping("/testPer")
    public String homePage() {
        for (int i = 0; i < 10000000; i++) {
            log.info("{} random {}",i, RandomUtil.randomDouble());
        }
        return "success";
    }
}
