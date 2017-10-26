package com.greenfox.messageservice.service;

public class TwitterService implements MessageService{

    @Override
    public void sendMessage(String user, String message) {
        System.out.println("Twitter message sent to " + user + " with Message = " + message);
    }
}
