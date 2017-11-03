package com.greenfox.reddit.controllers;

import com.greenfox.reddit.Service.PostService;
import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostService postService;

    @GetMapping({"", "/"})
    public String allPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNew(Model model) {
        model.addAttribute("newPost", new Post());
        return "newpost";
    }

    @PostMapping("/addnew")
    public String saveNew(@ModelAttribute Post post) {
        postRepository.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/upvote")
    public String upvote(@PathVariable(value = "id") long id) {
        Post post = postRepository.findOne(id);
        postService.upVote(post);
        postRepository.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/downvote")
    public String downvote(@PathVariable(value = "id") long id) {
        Post post = postRepository.findOne(id);
        postService.downVote(post);
        postRepository.save(post);
        return "redirect:/posts";
    }


}
