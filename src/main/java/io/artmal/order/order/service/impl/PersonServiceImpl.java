package io.artmal.order.order.service.impl;

import io.artmal.order.order.entity.Person;
import io.artmal.order.order.repository.PersonRepository;
import io.artmal.order.order.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
