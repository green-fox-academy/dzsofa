package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong apicalls = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greet(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        model.addAttribute("calls", apicalls.incrementAndGet());
        return "greeting";
    }
}
