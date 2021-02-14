package pl.sebroz.liquidbaseapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sebroz.liquidbaseapplication.model.User;
import pl.sebroz.liquidbaseapplication.services.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String userList(Model model) {
        model.addAttribute("users", userService.findAll());

        return "users";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", userService.newUser());

        return "new";
    }

    @PostMapping("/save")
    public String saveUser(User user) {
        userService.saveUser(user);

        return "redirect:/";
    }

}
