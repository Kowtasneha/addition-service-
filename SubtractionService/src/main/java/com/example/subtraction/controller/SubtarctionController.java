package com.example.subtraction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtarctionController {

    @GetMapping("/sub")
    public int sub(@RequestParam int a,
                   @RequestParam int b) {

        return a - b;
    }
}
