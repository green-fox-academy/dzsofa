package com.greenfox.playcolors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public PurpleColor myColor() {
        return new PurpleColor();
    }
}
