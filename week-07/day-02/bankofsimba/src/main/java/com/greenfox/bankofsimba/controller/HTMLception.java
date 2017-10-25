package com.greenfox.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLception {

    @RequestMapping("/htmlcool")
    public String htmlCeption(Model model) {
        model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>"
        );
        return "htmlception";
    }
}
