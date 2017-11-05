package com.greenfox.reddit.models;

import org.springframework.util.DigestUtils;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = DigestUtils.md5DigestAsHex(password.getBytes());
    }

    public User() {
    }
}
