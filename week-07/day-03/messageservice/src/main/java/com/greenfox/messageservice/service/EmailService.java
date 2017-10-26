package com.greenfox.messageservice.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String user, String message) {
        System.out.println("Email sent to " + user + " with Message = " + message);
    }
}
