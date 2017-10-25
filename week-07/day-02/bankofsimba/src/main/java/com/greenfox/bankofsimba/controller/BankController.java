package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BankController {
    ArrayList<BankAccount> bank = new ArrayList<>(Arrays.asList(new BankAccount("Scar", "0", "lion", false), (new BankAccount("Timon", "1500", "meerkat", false)), (new BankAccount("Rafiki", "15000", "mandrill", false)), (new BankAccount("Mufasa", "5000", "lion", false)), (new BankAccount("Simba", "2000", "lion", true))));


    @RequestMapping("/bank")
    public String bank(Model model) {
        model.addAttribute("bank", bank);
        return "bankinfo";
    }
}
