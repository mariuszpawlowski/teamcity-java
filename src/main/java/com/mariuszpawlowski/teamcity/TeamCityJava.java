package com.mariuszpawlowski.teamcity;

import com.mariuszpawlowski.teamcity.entity.project.ProjectsResponse;

/**
 * Created by mario on 21/11/15.
 */
public interface TeamCityJava {

    ProjectsResponse getProjects();
    void runBuild(String buildId);
}
