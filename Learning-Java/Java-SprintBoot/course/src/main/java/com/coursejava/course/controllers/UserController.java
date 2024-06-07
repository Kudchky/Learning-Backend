package com.coursejava.course.controllers;

import com.coursejava.course.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "user")
    public User getUser() {
        return new User("Pol", "Castillo", "rpcastilloy@gmail.com", "978302594","dass0d");
    }
}
