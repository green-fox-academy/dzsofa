package com.greenfox.reddit.models;

import javax.persistence.*;

@Entity
@Table(name = "reddit")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    int score;
    String content;

    public Post(String content) {
        this.score = 0;
        this.content = content;
    }

    public Post() {
        this.score = 0;
        this.content = "";
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
