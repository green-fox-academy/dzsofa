package com.greenfox.connecttomysql.controllers;

import com.greenfox.connecttomysql.models.Assignee;
import com.greenfox.connecttomysql.models.Todo;
import com.greenfox.connecttomysql.repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignees")
public class AssigneeController {

    @Autowired
    AssigneeRepo assigneeRepo;

    @GetMapping({"/", ""})
    public String listAss(Model model) {
        model.addAttribute("assignees", assigneeRepo.findAll());
        return "assignees";
    }

    @GetMapping("/addnew")
    public String input(Model model) {
        model.addAttribute("newAss", new Assignee());
        return "addassignee";
    }

    @PostMapping("/addnew")
    public String addTodo(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/assignees/";
    }

    @GetMapping("/{id}/delete")
    public String deleting(@PathVariable long id, Model model) {
        Assignee assignee = assigneeRepo.findOne(id);
        model.addAttribute("assignee", assignee);
        assigneeRepo.delete(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable long id, Model model) {
        Assignee assignee = assigneeRepo.findOne(id);
        model.addAttribute("editedAssignee", assignee);
        return "editassignee";
    }

    @PostMapping("/{id}/edit")
    public String edit(@ModelAttribute Assignee assignee) {
        assigneeRepo.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/todos")
    public String assTodos(@PathVariable long id, Model model) {
        Assignee assignee = assigneeRepo.findOne(id);
        model.addAttribute("assTodos", assignee.getTodos());
        return "asstodos";
    }

}
