package com.greenfox.hellobeanworld;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Your message: " + message;
    }
}
