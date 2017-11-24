package com.greenfox.orientationpractice.controllers;

import com.greenfox.orientationpractice.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    CarService carService;

    @GetMapping({"", "/"})
    public String search(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "index";
    }
}
