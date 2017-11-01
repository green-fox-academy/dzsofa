package com.greenfox.error.model.configuration;

import com.greenfox.error.model.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}
