package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    Fox myFox;

    @RequestMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("fox", myFox);
        return "index";
    }

    @RequestMapping("/nutritionstore")
    public String nutrition() {
        return "nutritioninfo";
    }
}
