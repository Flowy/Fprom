package com.flowyk.fprom.domain;

import java.util.List;

public interface PersonService {
    List<Person> availablePeople();
    Person addNewPerson(Person person);
    Person updatePerson(Person person);
    List<Project> removePerson(Person person);
}
