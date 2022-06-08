package com.flowyk.fprom.application;

import com.flowyk.fprom.business.PersonServiceImpl;
import com.flowyk.fprom.domain.PersistablePerson;
import com.flowyk.fprom.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersistablePersonTest {

    @Autowired
    private PersonServiceImpl personServiceImpl;

    @Test
    void saveAndLoadPerson() {
        PersistablePerson persistablePerson = new PersistablePerson()
                .setName("Name")
                .setLastName("Last Name");
        Person persisted = personServiceImpl.addNewPerson(persistablePerson);
        List<? extends Person> people = personServiceImpl.availablePeople();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals(persisted, people.get(0));
    }

    @Test
    void updatePerson() {
        PersistablePerson persistablePerson = new PersistablePerson()
                .setName("Name")
                .setLastName("Last Name");
        String newName = "New Name";
        Person persisted = personServiceImpl.addNewPerson(persistablePerson);
        Person updated = personServiceImpl.updatePerson(persistablePerson.setName(newName));

        List<? extends Person> people = personServiceImpl.availablePeople();
        Assertions.assertEquals(1, people.size());
        Assertions.assertEquals(updated, people.get(0));
        Assertions.assertEquals(newName, people.get(0).getName());
    }

}
