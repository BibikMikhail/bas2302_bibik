package ru.mfa.bas2302_bibik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

    @GetMapping("/lab1")
    public String showReport(){
        return "lab1";

    }

}
