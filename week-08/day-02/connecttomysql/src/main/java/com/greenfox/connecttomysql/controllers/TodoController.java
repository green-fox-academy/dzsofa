package com.greenfox.connecttomysql.controllers;

import com.greenfox.connecttomysql.Service.TodoService;
import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    TodoService todoService;

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model) {
        model.addAttribute("todos", todoService.listThem(isActive));
        return "todolist";
    }

    @GetMapping("/list/addnew")
    public String input(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "inputform";
    }

    @PostMapping("/list/addnew")
    public String addTodo(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo/";
    }

    @GetMapping("/{id}/delete")
    public String deleting(@PathVariable long id, Model model) {
        Todo todo = todoRepo.findOne(id);
        model.addAttribute("todo", todo);
        todoRepo.delete(id);
        return "redirect:/todo/";
    }

    @GetMapping("/list/{id}/edit")
    public String editPage(@PathVariable long id, Model model) {
        Todo todo = todoRepo.findOne(id);
        model.addAttribute("editedTodo", todo);
        return "edittodo";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo/";
    }

}
