package com.greenfox.error.model.controller;

import com.greenfox.error.model.model.User;
import com.greenfox.error.model.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {

    @Autowired
    UserService service;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("new_user", new User());
        model.addAttribute("yolo", service.getAll());
//        model.addAttribute("yolo", new User("alma", "korte"));
        return "index";
    }

    @PostMapping("/createuser")
    public String create(String firstName, String lastName) {
        service.save(new User(firstName, lastName));
        return "redirect:/";
    }
}