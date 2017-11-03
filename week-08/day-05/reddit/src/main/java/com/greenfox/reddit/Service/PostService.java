package com.greenfox.reddit.Service;

import com.greenfox.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostService {

    public void upVote(Post post) {
        post.setScore(post.getScore() + 1);
    }

    public void downVote(Post post) {
        post.setScore(post.getScore() - 1);
    }
}
