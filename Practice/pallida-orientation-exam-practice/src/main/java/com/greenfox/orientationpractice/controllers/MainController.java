package com.greenfox.orientationpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"", "/"})
    public String search() {
        return "index";
    }
}
