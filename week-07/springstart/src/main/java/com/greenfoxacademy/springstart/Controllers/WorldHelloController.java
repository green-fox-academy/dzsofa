package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.Random;

@Controller
public class WorldHelloController {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    String[] colors = {"pink", "magenta", "blue", "green", "purple", "yellow", "red"};
    String[] fontsize = { "12px", "14px", "16px", "18px", "20px", "24px", "32px", "40px"};
    Random random = new Random();

    @RequestMapping("/web/greeting/allangs")
    public String greet(Model model, @RequestParam String name) {
        model.addAttribute("color", colors[random.nextInt(colors.length)]);
        model.addAttribute("fontsize", fontsize[random.nextInt(fontsize.length)]);
        model.addAttribute("hello", hellos[random.nextInt(hellos.length)]);
        model.addAttribute("name", name);
        return "greeting";
    }
}