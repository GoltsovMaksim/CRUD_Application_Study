package ru.alishev.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping()
    public String index(Model model) {
        //получим всех людей из ДАО и на отображение в view
        return null;
    }

    @RequestMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
         //получаем одного человека из DAO  и передаем на отображение во view

        return null;
    }
}
