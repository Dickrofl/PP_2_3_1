package web.controller;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @Autowired
    UserDao userService;

    @GetMapping("/")
    public String getUsersPage(Model model) {
        model.addAttribute("newuser", new User());
        model.addAttribute("user", userService.getAllUsers());
        return "index";
    }

    @PostMapping("/new")
    public String addUser(@ModelAttribute("newuser") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.removeUserById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PutMapping("/edit")
    public String editUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

}