package com.flowyk.fprom.domain;

import java.util.List;

public interface PersonService {
    List<? extends Person> availablePeople();
    Person addNewPerson(Person persistablePerson);
    Person updatePerson(Person persistablePerson);
    List<Project> removePerson(Person persistablePerson);
}
