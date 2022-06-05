package io.artmal.order.order.controller;


import io.artmal.order.order.entity.Pizza;
import io.artmal.order.order.service.PizzaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaController {

    private PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/pizzas")
    public String getAllPizzas(Model model){
        model.addAttribute("pizzas", pizzaService.getAllPizzas());
        return "pizzas";
    }

    @GetMapping("/pizzas/")
    public String creatPizzaForm(Model model) {

        // create student object to hold student form data
        Pizza pizza = new Pizza();
        model.addAttribute("pizza", pizza);
        return "pizzas";
    }

    @PostMapping("/pizzas")
    public String savePizzaForm(@ModelAttribute("pizza") Pizza pizza){
        pizzaService.savePizza(pizza);
        return "redirect:/pizzas";
    }
}
