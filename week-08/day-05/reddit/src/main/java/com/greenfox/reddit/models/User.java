package com.greenfox.reddit.models;

import org.springframework.util.DigestUtils;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

  @Id
  private String username;
  private String password;

  @OneToMany(fetch = FetchType.EAGER)
  Set<Post> posts;


  public User(String username, String password) {
    this.username = username;
    this.password = DigestUtils.md5DigestAsHex(password.getBytes());
  }

  public User() {
  }
}
