package io.artmal.order.order.service;

import io.artmal.order.order.entity.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAllPizzas();

    Pizza savePizza(Pizza pizza);

    Pizza getPizzaById(Long id);

    Pizza orderPizzaByPerson(Pizza pizza);
}
