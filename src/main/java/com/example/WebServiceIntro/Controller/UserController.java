package com.example.WebServiceIntro.Controller;

import com.example.WebServiceIntro.Entity.User;
import com.example.WebServiceIntro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    private String saveUser(
            @RequestBody User user
    ) {
        //Spara user i DB
        User newUser = userService.saveUser(user);

        return String.format("Ny användare skapad med namn %s och ID nummer %d", newUser.getUserName(), newUser.getId());
    }

    @GetMapping("")
    private String loadUsers() {
        List<User> users = userService.loadUser();

        String response = "Namnen på alla users är: ";

        for(User user : users) {
            response += user.getUserName() + ", ";
        }

        return response;
    }

    @GetMapping("/{id}")
    private String loadUser(
            @PathVariable Long id
    ) {
        User user = userService.loadOneUser(id);

        return String.format("Användaren %s har ID %d", user.getUserName(), user.getId());
    }
}
