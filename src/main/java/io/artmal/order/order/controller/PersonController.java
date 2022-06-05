package io.artmal.order.order.controller;

import io.artmal.order.order.entity.Person;
import io.artmal.order.order.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        super();
        this.personService = personService;
    }

    @GetMapping("/pizzas/order")
    public String creatContactForm(Model model) {

        // create student object to hold student form data
        Person person = new Person();
        model.addAttribute("person", person);
        return "pizzas_order";
    }
}
