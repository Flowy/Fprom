package com.flowyk.fprom.domain;

public interface ProjectRole {
    Long getId();
    Role getRole();
    PersistablePerson getPersistablePerson();
    Project getProject();
}
