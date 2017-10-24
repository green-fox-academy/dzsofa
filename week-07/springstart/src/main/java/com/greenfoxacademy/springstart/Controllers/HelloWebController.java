package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greet(Model model) {
        model.addAttribute("name", " World");
        return "greeting";
    }
}
