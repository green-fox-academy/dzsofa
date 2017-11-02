package com.greenfox.connecttomysql.models;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo(String title) {
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
    }


    public Todo() {
        isUrgent = false;
        isDone = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    private Assignee assignee;
}
