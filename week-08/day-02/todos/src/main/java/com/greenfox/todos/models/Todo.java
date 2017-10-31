package com.greenfox.todos.models;

import com.greenfox.todos.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo(String title) {
        this.id = id;
        this.title = title;
        this.isUrgent = false;
        this.isDone = false;
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
