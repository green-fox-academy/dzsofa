package com.greenfox.frontend.models;

public class Doubling {
    private int received;
    private int result;


    public Doubling(int received) {
        this.received = received;
    }

    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public String getResult() {
        return String.valueOf(result);
    }

    public void setResult(int result) {
        this.result = result;
    }
}
