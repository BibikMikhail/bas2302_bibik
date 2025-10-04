package ru.mfa.bas2302_bibik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${greeting.text}")
    private String greetingText;

    @GetMapping("/welcome")
    public String hello() {
        return greetingText;
    }


}
