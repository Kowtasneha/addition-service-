package com.example.multiplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplicationController {

    @GetMapping("/mul")
    public int mul(@RequestParam int a,
                   @RequestParam int b) {

        return a * b;
    }
}

