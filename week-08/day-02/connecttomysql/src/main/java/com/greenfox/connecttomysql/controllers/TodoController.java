package com.greenfox.connecttomysql.controllers;

import com.greenfox.connecttomysql.Service.TodoService;
import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.AssigneeRepo;
import com.greenfox.connecttomysql.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    TodoService todoService;

    @Autowired
    private AssigneeRepo assigneeRepo;

    @GetMapping({"/", "/list"})
    public String list(@RequestParam(value = "isActive", required = false) Boolean isActive, Model model, Todo todo) {
        model.addAttribute("todos", todoService.listThem(isActive));
        return "todolist";
    }

    @GetMapping({"/list/search"})
    public String filterTitle(@RequestParam(value = "title", required = false) String title, Model model, Todo todo) {
        model.addAttribute("todos", todoRepo.findAllByTitle(title));
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
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "edittodo";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo/";
    }

}
