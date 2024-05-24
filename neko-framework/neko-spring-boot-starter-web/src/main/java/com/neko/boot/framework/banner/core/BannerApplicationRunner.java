package com.neko.boot.framework.banner.core;

import cn.hutool.core.thread.ThreadUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.concurrent.TimeUnit;

/**
 * 控制台打印内容自动配置类
 * @author Gong Zheng
 * @since 2024/5/24 11:57
 */
@Slf4j
public class BannerApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){
        ThreadUtil.execute(() -> {
            ThreadUtil.sleep(1, TimeUnit.SECONDS);
            log.info("\n----------------------------------------------------------\n\t" +
                            "项目启动成功！\n\t" +
                            "技术支持: \t{} \n\t" +
                            "接口文档: \t{} \n\t" +
                            "版权所有: \t{} \n" +
                            "----------------------------------------------------------",
                    "链接1",
                    "链接2",
                    "Centric Software");
        });
    }
}
