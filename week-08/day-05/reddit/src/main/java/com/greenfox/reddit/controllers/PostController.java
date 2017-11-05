package com.greenfox.reddit.controllers;

import com.greenfox.reddit.Service.PostService;
import com.greenfox.reddit.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping({"", "/"})
    public String allPosts(@RequestParam(value = "pageId", defaultValue = "0") int pageId, Model model) {
        if (pageId < 0 || pageId > postService.nrOfRows() / 10 + 1) {
            return "redirect:/posts";
        }
        model.addAttribute("posts", postService.listAllPosts(pageId));
        model.addAttribute("pageId", pageId);
        model.addAttribute("nrOfRows", postService.nrOfRows());
        return "index";
    }

    @GetMapping("/addnew")
    public String addNew(Model model) {
        postService.newPost(model);
        return "newpost";
    }

    @PostMapping("/addnew")
    public String saveNew(@ModelAttribute Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/upvote")
    public String upvote(@PathVariable(value = "id") long id) {
        postService.upVote(id);
        return "redirect:/posts";
    }

    @GetMapping("/{id}/downvote")
    public String downvote(@PathVariable(value = "id") long id) {
        postService.downVote(id);
        return "redirect:/posts";
    }

}
