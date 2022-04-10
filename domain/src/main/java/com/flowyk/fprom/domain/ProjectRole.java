package com.flowyk.fprom.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Role role;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Project project;

}
