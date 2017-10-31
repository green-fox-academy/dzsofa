package com.greenfox.todos.models;

public class Todo {
    private int id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo(int id, String title, boolean isUrgent, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
    }


    public Todo() {
        isUrgent = false;
        isDone = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
