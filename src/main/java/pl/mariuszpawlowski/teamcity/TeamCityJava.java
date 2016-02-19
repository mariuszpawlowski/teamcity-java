package pl.mariuszpawlowski.teamcity;

import pl.mariuszpawlowski.teamcity.entity.build.response.BuildResponse;
import pl.mariuszpawlowski.teamcity.entity.build.response.RunBuildResponse;
import pl.mariuszpawlowski.teamcity.entity.project.ProjectsResponse;

/**
 * Created by mario on 21/11/15.
 */
public interface TeamCityJava {

    ProjectsResponse getProjects();
    RunBuildResponse runBuild(String buildId);
    BuildResponse getBuild(String currentBuildId);
}
