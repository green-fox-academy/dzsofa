package com.greenfox.foxclub.configurator;

import com.greenfox.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class FoxConfigurator {

    @Bean
    public Fox myFox() {
        return new Fox();
    }
}
