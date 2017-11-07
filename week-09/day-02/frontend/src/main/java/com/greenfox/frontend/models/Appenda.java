package com.greenfox.frontend.models;

public class Appenda {
    private String appended;

    public Appenda() {
    }

    public Appenda(String appended) {
        this.appended = appended.concat("a");
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended.concat("a");
    }

}
