package com.greenfox.foxclub.controller;


import com.greenfox.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoxController {

    @Autowired
    Fox fox;

    @GetMapping("/edit")
    public String edit(Model model) {
        model.addAttribute("fox", fox);
        return "edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Fox fox) {
        this.fox.setName(fox.getName());
        return "redirect:/";
    }

}
