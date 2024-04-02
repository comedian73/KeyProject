package ru.oldyrev.MegaKeys.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.oldyrev.MegaKeys.demo.service.UserService;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping (value = "/user")
    public String user(){
        return "user";
    }
}