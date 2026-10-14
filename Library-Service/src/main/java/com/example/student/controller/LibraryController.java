package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/book")
    public String getBook(
            @RequestParam int id,
            @RequestParam String name) {

        return "Book Details : ID = " + id +
               ", Name = " + name;
    }
}