package web.controller;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    private  final UserDao userService;

    public UserController(UserDao userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getUsersPage(Model model) {
        model.addAttribute("user", userService.getAllUsers());
        return "index";
    }
    @GetMapping("/newUser")
    public String newUser(Model model) {
        model.addAttribute("newuser", new User());
        return "newUser";
    }
    @PostMapping("/new")
    public String addUser(@ModelAttribute("newuser") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.removeUserById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

}