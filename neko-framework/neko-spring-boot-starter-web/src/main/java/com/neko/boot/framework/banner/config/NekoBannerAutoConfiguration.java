package com.neko.boot.framework.banner.config;

import com.neko.boot.framework.banner.core.BannerApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author Gong Zheng
 * @since 2024/5/24 12:43
 */
@AutoConfiguration
public class NekoBannerAutoConfiguration {
    @Bean
    public BannerApplicationRunner bannerApplication(){
        return new BannerApplicationRunner();
    }
}
