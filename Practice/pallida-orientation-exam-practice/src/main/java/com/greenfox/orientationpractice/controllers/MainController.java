package com.greenfox.orientationpractice.controllers;

import com.greenfox.orientationpractice.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    CarService carService;

    @GetMapping({"", "/"})
    public String index(Model model) {
        model.addAttribute("cars", carService.getCars());
        return "index";
    }

    @GetMapping("/search")
    public String search(Model model, @RequestParam(required = false) Boolean police, @RequestParam(required = false) Boolean diplomat, @RequestParam(required = false) String q) {
        if (police != null) {
            model.addAttribute("cars", carService.findPolice());
        } else if (diplomat != null) {
            model.addAttribute("cars", carService.findDiplomat());
        } else if (q != null && q.matches("a-zA-Z0-9-")) {
            model.addAttribute("cars", carService.findCarsByPlate(q));
        } else {
            model.addAttribute("cars", carService.getCars());
        }
        return "index";
    }
}
