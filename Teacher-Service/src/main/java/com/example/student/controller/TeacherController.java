package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @GetMapping("/teacher")
    public String getTeacher(
            @RequestParam int id,
            @RequestParam String name) {

        return "Teacher Details : ID = " + id +
               ", Name = " + name;
    }
}