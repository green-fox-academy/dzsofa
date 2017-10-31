package com.greenfox.todos.controllers;

import com.greenfox.todos.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepo.findAll());
        return "todolist";
    }

}
