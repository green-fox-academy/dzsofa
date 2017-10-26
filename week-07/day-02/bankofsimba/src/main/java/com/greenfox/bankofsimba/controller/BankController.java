package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {
    List<BankAccount> bank = Arrays.asList(new BankAccount("Scar", 0, "lion", false, false),
            (new BankAccount("Timon", 1500, "meerkat", false, true)),
            (new BankAccount("Rafiki", 15000, "mandrill", false, true)),
            (new BankAccount("Mufasa", 5000, "lion", false, true)),
            (new BankAccount("Simba", 2000, "lion", true, true)));

    public List<BankAccount> getBank() {
        return this.bank;
    }

    @RequestMapping("/bank")
    public String bank(Model model) {
        model.addAttribute("bank", getBank());
        return "bankinfo";
    }

    @PostMapping("/increasebalance")
    public String increase() {
        for (int i = 0; i < bank.size(); i++) {
            if ( bank.get(i).isKing) {
                bank.get(i).setBalance( bank.get(i).getBalance() + 100);
            } else {
                bank.get(i).setBalance( bank.get(i).getBalance() + 10);
            }
        }
        return "redirect:/bank";
    }

//    @PostMapping("/bank")
//    public String raise(@ModelAttribute ArrayList<BankAccount> bank) {
//
//        return bank;
//    }

}
