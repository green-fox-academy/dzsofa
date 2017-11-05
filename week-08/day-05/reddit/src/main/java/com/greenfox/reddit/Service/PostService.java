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

    public Iterable<Post> listAllPosts(int pageId) {
        return postRepository.getPostsByPage(pageId * 10);
    }

    public void upVote(@PathVariable(value = "id") long id) {
        getPost(id).setScore(getPost(id).getScore() + 1);
        save(getPost(id));
    }

    public void downVote(@PathVariable(value = "id") long id) {
        getPost(id).setScore(getPost(id).getScore() - 1);
        save(getPost(id));
    }

    public Post getPost(@PathVariable(value = "id") long id) {
        Post post = postRepository.findOne(id);
        return post;
    }

    public void newPost(Model model) {
        model.addAttribute("newPost", new Post());
    }

    public void save(Post post) {
        postRepository.save(post);
    }

    public int nrOfRows() {
       return postRepository.rowNum();
    }
}

