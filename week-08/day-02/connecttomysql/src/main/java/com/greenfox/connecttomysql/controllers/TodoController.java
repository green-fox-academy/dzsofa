package com.greenfox.connecttomysql.controllers;

import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
        List<Todo> todos = new ArrayList<>();
        for (Todo todo : todoRepo.findAll()) {
            if (isActive) {
                if (!todo.isDone()) {
                    todos.add(todo);
                }
            } else if (!isActive) {
                if (todo.isDone()) {
                    todos.add(todo);
                }
            }
        }
        model.addAttribute("todos", todos);
        return "todolist";
    }

    @GetMapping("/addnew")
    public String input() {
        return "inputform";
    }

    @PostMapping("/addnew")
    public String addTodo(@RequestParam String title) {
        todoRepo.save(new Todo(title));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable long id) {
        todoRepo.delete(id);
        return new ModelAndView("redirect:/todo/list");
    }
}
