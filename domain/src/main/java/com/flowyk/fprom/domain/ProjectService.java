package com.flowyk.fprom.domain;

import java.util.List;

public interface ProjectService {
    List<Project> availableProjects();
    Project addNewProject(Project project);
    Project updateProject(Project project);
    void removeProject(Project project);
    Project updatePeopleOnProject(Project project, List<Person> people);
}
