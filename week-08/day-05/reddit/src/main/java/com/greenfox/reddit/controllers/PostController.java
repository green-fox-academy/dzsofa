package com.greenfox.reddit.controllers;

import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping({"", "/"})
    public String allPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }


}
