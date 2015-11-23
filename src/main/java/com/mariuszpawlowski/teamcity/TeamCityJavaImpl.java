package com.mariuszpawlowski.teamcity;

import com.mariuszpawlowski.teamcity.entity.project.ProjectsResponse;

/**
 * Created by mario on 21/11/15.
 */
public class TeamCityJavaImpl implements TeamCityJava{

    private String login;
    private String password;
    private String teamCityHost;

    public TeamCityJavaImpl(String login, String password, String teamCityHost){
        this.login = login;
        this.password = password;
        this.teamCityHost = teamCityHost;
    }

    public ProjectsResponse getProjects() {
        String url = teamCityHost + "/httpAuth/app/rest/projects";
        RestClient restClient = new RestClient(login, password);
        return restClient.getProjects(url);
    }

    public void runBuild(String buildId) {
        String url = teamCityHost + "/httpAuth/app/rest/buildQueue";
        RestClient restClient = new RestClient(login, password);
        restClient.runBuild(url, buildId);
    }
}
