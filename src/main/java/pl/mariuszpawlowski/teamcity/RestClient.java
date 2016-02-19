package pl.mariuszpawlowski.teamcity;

import pl.mariuszpawlowski.teamcity.entity.build.request.BuildRequest;
import pl.mariuszpawlowski.teamcity.entity.build.request.BuildType;
import pl.mariuszpawlowski.teamcity.entity.build.response.BuildResponse;
import pl.mariuszpawlowski.teamcity.entity.build.response.RunBuildResponse;
import pl.mariuszpawlowski.teamcity.entity.project.ProjectsResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import javax.ws.rs.core.MediaType;

/**
 * Created by mario on 21/11/15.
 */
public class RestClient {

    private String login;
    private String password;

    public RestClient(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public Client getClient() {
        ClientConfig clientConfig = new DefaultClientConfig();
        Client client = Client.create(clientConfig);
        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter(login, password);
        client.addFilter(authFilter);
        client.setConnectTimeout(10 * 1000);
        return client;
    }

    public ProjectsResponse getProjects(String url){
        WebResource webResource = getClient().resource(url);
        ProjectsResponse response = webResource.accept(MediaType.APPLICATION_XML).get(ProjectsResponse.class);
        return response;
    }


    public RunBuildResponse runBuild(String url, String buildId) {
        BuildRequest buildRequest = new BuildRequest();
        BuildType buildType = new BuildType();
        buildType.setId(buildId);
        buildRequest.setBuildType(buildType);
        WebResource webResource = getClient().resource(url);
        RunBuildResponse response = webResource.accept(MediaType.APPLICATION_XML).post(RunBuildResponse.class, buildRequest);
        return response;
    }

    public BuildResponse getBuild(String url) {
        WebResource webResource = getClient().resource(url);
        BuildResponse response = webResource.accept(MediaType.APPLICATION_XML).get(BuildResponse.class);
        return response;
    }
}
