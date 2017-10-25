package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
    BankAccount simbAccount = new BankAccount("Simba", 2000, "lion");

    @RequestMapping("/accinf")
    public String accountInfo(Model model) {
        model.addAttribute("name", simbAccount.getName());
        model.addAttribute("balance", simbAccount.getBalance());
        model.addAttribute("animal", simbAccount.getAnimalType());
        return "accinfo";
    }
}
