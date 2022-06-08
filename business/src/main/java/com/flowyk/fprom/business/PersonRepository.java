package com.flowyk.fprom.business;

import com.flowyk.fprom.domain.PersistablePerson;
import com.flowyk.fprom.domain.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    Optional<? extends Person> findById(Long id);
    List<? extends Person> findAll();
    Person save(Person people);
}
