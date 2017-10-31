package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    Fox myFox;

    @Autowired
    Trick trick;

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("fox", myFox);
        return "index";
    }

    @GetMapping("/nutritionstore")
    public String nutrition(Model model) {
        model.addAttribute("fox", myFox);
        model.addAttribute("foods", Food.values());
        model.addAttribute("drinks", Drink.values());
        return "nutritioninfo";
    }

    @PostMapping("/changeFood")
    public String setNutrition(@ModelAttribute Fox fox) {
        this.myFox.setMyFood(fox.getMyFood());
        this.myFox.setMyDrink(fox.getMyDrink());
        return "redirect:/";
    }

    @GetMapping("/trickcenter")
    public String tricks(Model model) {
        trick.setTrickName("");
        model.addAttribute("fox", myFox);
        model.addAttribute("tricky", trick);
//        model.addAttribute("trickname", trick.getTrickName());
        return "trickcenter";
    }

    @PostMapping("/addTrick")
    public String addTrick(@ModelAttribute Trick trick) {
        this.trick = trick;
        myFox.addTrick(trick.getTrickName());
        return "redirect:/trickcenter";
    }
}
