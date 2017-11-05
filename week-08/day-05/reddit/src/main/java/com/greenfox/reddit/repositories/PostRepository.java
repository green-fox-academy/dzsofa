package com.greenfox.reddit.repositories;

import com.greenfox.reddit.models.Post;
import javafx.geometry.Pos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    @Query(value = "SELECT * FROM reddit ORDER BY score DESC LIMIT 10 OFFSET ?1", nativeQuery = true)
    Iterable<Post> getPostsByPage(int pageId);


    @Query(value = "SELECT COUNT(*) FROM reddit", nativeQuery = true)
    Integer rowNum();
}
