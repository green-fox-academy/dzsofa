package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

}
