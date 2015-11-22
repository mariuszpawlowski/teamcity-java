package com.mariuszpawlowski.teamcity;

import com.mariuszpawlowski.teamcity.entity.Projects;

/**
 * Created by mario on 21/11/15.
 */
public interface TeamCityJava {

    Projects getProjects();
    void runBuild(String buildId);
}
