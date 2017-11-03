package com.greenfox.reddit.Service;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class PostService {

    @Autowired
    PostRepository postRepository;

    public void upVote(@PathVariable(value = "id") long id) {
        Post post = postRepository.findOne(id);
        post.setScore(post.getScore() + 1);
        postRepository.save(post);
    }

    public void downVote(@PathVariable(value = "id") long id) {
        Post post = postRepository.findOne(id);
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
    }

    public void allPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll());
    }

    public void newPost(Model model) {
        model.addAttribute("newPost", new Post());
    }

    public void save(Post post) {
        postRepository.save(post);
    }
}
