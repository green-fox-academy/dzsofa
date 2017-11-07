package com.greenfox.frontend.models;

public class Greeting {
    private String name;
    private String title;

    private String welcome_message;

    public Greeting() {
    }

    public Greeting(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message() {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }


}
