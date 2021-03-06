package com.greenfox.reddit.controllers;

import com.greenfox.reddit.service.UserService;
import com.greenfox.reddit.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping("/login")
  public String loginMain(
      @RequestParam(value = "lg_username", defaultValue = "") String lg_username,
      @RequestParam(value = "lg_password", defaultValue = "") String lg_password, Model model) {
    model.addAttribute("username", UserService.getSession().getAttribute("username"));
    if (!lg_username.equals("") && !lg_password.equals("")) {
      User user = userService
          .login(lg_username, DigestUtils.md5DigestAsHex(lg_password.getBytes()));
      if (user != null) {
        UserService.getSession().setAttribute("username", lg_username);
        return "redirect:/posts";
      }
    }
    return "login";
  }

  @GetMapping("/logout")
  public String logout() {
    UserService.destroySession();
    return "redirect:/login";
  }

  @PostMapping("/register")
  public String addNewUser(
      @RequestParam(value = "reg_username", defaultValue = "") String lg_username,
      @RequestParam(value = "reg_password", defaultValue = "") String lg_password, Model model) {
    if (!lg_username.equals("") && !lg_password.equals("")) {
      userService.save(lg_username, lg_password);
    }
    return "redirect:/login";
  }

}
