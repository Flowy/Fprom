package com.flowyk.fprom.persistence;

import com.flowyk.fprom.business.PersonRepository;
import com.flowyk.fprom.domain.PersistablePerson;
import com.flowyk.fprom.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private PersonRepositoryDAO personRepositoryDAO;

    @Override
    public Optional<? extends Person> findById(Long id) {
        return personRepositoryDAO.findById(id);
    }

    @Override
    public List<? extends Person> findAll() {
        return personRepositoryDAO.findAll();
    }

    @Override
    public Person save(Person people) {
        PersistablePerson persistablePerson = new PersistablePerson()
                .setId(people.getId())
                .setName(people.getName())
                .setLastName(people.getLastName())
                .setProjectRoles(people.getProjectRoles());
        return personRepositoryDAO.save(persistablePerson);
    }
}
