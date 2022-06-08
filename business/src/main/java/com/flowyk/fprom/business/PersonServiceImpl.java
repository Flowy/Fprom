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
    public List<? extends Person> availablePeople() {
        return personRepository.findAll();
    }

    @Override
    public Person addNewPerson(Person persistablePerson) {
        if (persistablePerson.getId() != null && personRepository.findById(persistablePerson.getId()).isPresent()) {
            throw new IllegalArgumentException("Person already exists");
        }
        return personRepository.save(persistablePerson);
    }

    @Override
    public Person updatePerson(Person persistablePerson) {
        if (persistablePerson.getId() == null || personRepository.findById(persistablePerson.getId()).isEmpty()) {
            throw new IllegalArgumentException("Person does not exists yet");
        }
        return personRepository.save(persistablePerson);
    }

    @Override
    public List<Project> removePerson(Person persistablePerson) {
        return null;
    }
}
