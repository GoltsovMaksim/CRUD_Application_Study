package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alishev.springcourse.DAO.PersonDAO;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model) {
        //получим всех людей из ДАО и на отображение в view
        model.addAttribute("people",personDAO.index());
        return "/index";
    }

    @RequestMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        //получаем одного человека из DAO  и передаем на отображение во view
        model.addAttribute("person", personDAO.show(id));

        return "/show ";
    }
}
