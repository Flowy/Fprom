package com.flowyk.fprom.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String shortName;

    @Convert(converter = ListToStringConverter.class)
    private List<String> customer;

    @OneToMany
    private List<PersistableProjectRole> people;

    public Long getId() {
        return id;
    }

    public Project setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public Project setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public List<String> getCustomer() {
        return customer;
    }

    public Project setCustomer(List<String> customer) {
        this.customer = customer;
        return this;
    }

    public List<PersistableProjectRole> getPeople() {
        return people;
    }

    public Project setPeople(List<PersistableProjectRole> people) {
        this.people = people;
        return this;
    }
}
