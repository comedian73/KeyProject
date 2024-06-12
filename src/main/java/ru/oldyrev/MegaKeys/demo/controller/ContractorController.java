package ru.oldyrev.MegaKeys.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ContractorController {

    @GetMapping(value = "/contractor")
    public String contractor(){
        return "contractor";
    }
}
