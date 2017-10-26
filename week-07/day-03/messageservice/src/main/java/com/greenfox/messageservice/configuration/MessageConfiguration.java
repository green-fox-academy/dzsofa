package com.greenfox.messageservice.configuration;

import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProcessor;
import com.greenfox.messageservice.service.MessageService;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageProcessor processor() {
        return new MessageProcessor();
    }

    @Bean
    public MessageService email() {
        return new EmailService();
    }

    public MessageService twitter() {
        return new TwitterService();
    }
}
