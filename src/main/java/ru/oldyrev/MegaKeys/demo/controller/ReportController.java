package ru.oldyrev.MegaKeys.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ReportController {
    @GetMapping(value = "/report")
    public String report(){
        return "report";
    }
}
