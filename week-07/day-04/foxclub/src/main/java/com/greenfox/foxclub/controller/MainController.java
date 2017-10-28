package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    Fox myFox;

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("fox", myFox);
        return "index";
    }

    @GetMapping("/nutritionstore")
    public String nutrition(Model model) {
        model.addAttribute("food", Food.class);
        return "nutritioninfo";
    }
//
//    public String setNutrition()

    @GetMapping("/trickcenter")
    public String tricks(Model model) {
        model.addAttribute("fox", myFox);
        model.addAttribute("trick", Trick.class);
        return "trickcenter";
    }
}
