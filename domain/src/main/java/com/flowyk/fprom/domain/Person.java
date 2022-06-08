package com.flowyk.fprom.domain;

import java.util.List;

public interface Person {
    Long getId();
    String getName();
    String getLastName();
    List<? extends ProjectRole> getProjectRoles();
}
