package io.artmal.order.order.repository;

import io.artmal.order.order.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
