package com.flowyk.fprom.application;

import com.flowyk.fprom.domain.Person;
import com.flowyk.fprom.domain.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    void saveAndLoadPerson() {
        Person person = new Person()
                .setName("Name")
                .setLastName("Last Name");
        Person persisted = personService.addNewPerson(person);
        List<Person> people = personService.availablePeople();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals(persisted, people.get(0));
    }

    @Test
    void updatePerson() {
        Person person = new Person()
                .setName("Name")
                .setLastName("Last Name");
        String newName = "New Name";
        Person persisted = personService.addNewPerson(person);
        Person updated = personService.updatePerson(persisted.setName(newName));

        List<Person> people = personService.availablePeople();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals(updated, people.get(0));
        Assertions.assertEquals(newName, people.get(0).getName());
    }

}
