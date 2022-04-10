package com.flowyk.fprom.business;

import com.flowyk.fprom.domain.Person;
import com.flowyk.fprom.domain.PersonService;
import com.flowyk.fprom.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> availablePeople() {
        return personRepository.findAll();
    }

    @Override
    public Person addNewPerson(Person person) {
        if (person.getId() != null && personRepository.findById(person.getId()).isPresent()) {
            throw new IllegalArgumentException("Person already exists");
        }
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        if (person.getId() == null || personRepository.findById(person.getId()).isEmpty()) {
            throw new IllegalArgumentException("Person does not exists yet");
        }
        return personRepository.save(person);
    }

    @Override
    public List<Project> removePerson(Person person) {
        return null;
    }
}
