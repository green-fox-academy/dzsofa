package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageProcessor {

    @Autowired
    MessageService message;

    public void processMessage(String messageContent, String user) {
        message.sendMessage(user, messageContent);
    }
}
    