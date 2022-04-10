package com.flowyk.fprom.business;

import com.flowyk.fprom.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Optional<Person> findById(Long id);
    List<Person> findAll();
    Person save(Person people);
}
