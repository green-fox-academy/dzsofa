package com.greenfox.foxclub.model;

public class Trick {
    private String trickName;


    public Trick(String trickName) {
        this.trickName = trickName;
    }

    public Trick() {
    }

    public String getTrickName() {
        return trickName;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    @Override
    public String toString() {
        return this.trickName;
    }
}
