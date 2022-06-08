package com.flowyk.fprom.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class PersistablePerson implements Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String lastName;

    @OneToMany
    private List<PersistableProjectRole> projectRoles;

    @Override
    public Long getId() {
        return id;
    }

    public PersistablePerson setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    public PersistablePerson setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public PersistablePerson setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public List<PersistableProjectRole> getProjectRoles() {
        return projectRoles;
    }

    public PersistablePerson setProjectRoles(List<PersistableProjectRole> project) {
        this.projectRoles = project;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersistablePerson persistablePerson = (PersistablePerson) o;

        return id != null ? id.equals(persistablePerson.id) : persistablePerson.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
