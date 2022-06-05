package io.artmal.order.order.service.impl;

import io.artmal.order.order.entity.Person;
import io.artmal.order.order.entity.Pizza;
import io.artmal.order.order.repository.PizzaRepository;

import io.artmal.order.order.service.PizzaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService{

    private PizzaRepository pizzaRepository;

    public PizzaServiceImpl(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza savePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public Pizza getPizzaById(Long id) {
        return pizzaRepository.findById(id).get();
    }

    @Override
    public Pizza orderPizzaByPerson(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }
}
