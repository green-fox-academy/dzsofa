package com.greenfox.bankofsimba.controller;

import com.greenfox.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BankController {
    ArrayList<BankAccount> bank;

    public ArrayList<BankAccount> generateBank() {
        bank = new ArrayList<>(Arrays.asList(new BankAccount("Scar", 0, "lion", false, false),
                (new BankAccount("Timon", 1500, "meerkat", false, true)),
                (new BankAccount("Rafiki", 15000, "mandrill", false, true)),
                (new BankAccount("Mufasa", 5000, "lion", false, true)),
                (new BankAccount("Simba", 2000, "lion", true, true))));
        return bank;
    }

    @RequestMapping("/bank")
    public String bank(Model model) {
        generateBank();
        model.addAttribute("bank", bank);
        return "bankinfo";
    }

    @PostMapping("/increasebalance")
    public String increase(@ModelAttribute BankAccount account) {
        for (int i = 0; i < bank.size(); i++) {
            bank.get(i).equals(account);
            if (account.isKing) {
                account.setBalance(account.getBalance() + 100);
            } else {
                account.setBalance(account.getBalance() + 10);
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
