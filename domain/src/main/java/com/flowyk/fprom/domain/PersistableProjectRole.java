package com.flowyk.fprom.domain;

import javax.persistence.*;

@Entity
public class PersistableProjectRole implements ProjectRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Role role;

    @ManyToOne
    private PersistablePerson persistablePerson;

    @ManyToOne
    private Project project;

    @Override
    public Long getId() {
        return id;
    }

    public PersistableProjectRole setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Role getRole() {
        return role;
    }

    public PersistableProjectRole setRole(Role role) {
        this.role = role;
        return this;
    }

    @Override
    public PersistablePerson getPersistablePerson() {
        return persistablePerson;
    }

    public PersistableProjectRole setPersistablePerson(PersistablePerson persistablePerson) {
        this.persistablePerson = persistablePerson;
        return this;
    }

    @Override
    public Project getProject() {
        return project;
    }

    public PersistableProjectRole setProject(Project project) {
        this.project = project;
        return this;
    }
}
