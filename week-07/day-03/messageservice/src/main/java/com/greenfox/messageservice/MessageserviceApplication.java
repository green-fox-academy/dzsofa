package com.greenfox.messageservice;

import com.greenfox.messageservice.service.MessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageserviceApplication implements CommandLineRunner {

    @Autowired
    MessageProcessor messageProcessor;

    public static void main(String[] args) {

        SpringApplication.run(MessageserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        messageProcessor.processMessage("Whatap, dude?", "example@whatap.com");
    }
}