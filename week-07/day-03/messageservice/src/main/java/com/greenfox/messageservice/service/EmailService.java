package com.greenfox.messageservice.service;

public class EmailService implements MessageService {
    private String message;
    private String user;

    public EmailService(String message, String user) {
        this.message = message;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public void sendMessage() {
        System.out.println("Email sent to " + getUser() + "with Message = " + getMessage());
    }
}
