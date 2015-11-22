package com.mariuszpawlowski.teamcity;

import com.mariuszpawlowski.teamcity.entity.Build;
import com.mariuszpawlowski.teamcity.entity.BuildType;
import com.mariuszpawlowski.teamcity.entity.Projects;
import com.owlike.genson.ext.jaxrs.GensonJsonConverter;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
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
        ClientConfig clientConfig = new DefaultClientConfig(GensonJsonConverter.class);
        Client client = Client.create(clientConfig);
        HTTPBasicAuthFilter authFilter = new HTTPBasicAuthFilter(login, password);
        client.addFilter(authFilter);
        client.setConnectTimeout(10 * 1000);
        return client;
    }

    public Projects getProjects(String url){
        WebResource webResource = getClient().resource(url);
        Projects response = webResource.accept(MediaType.APPLICATION_XML).get(Projects.class);
        return response;
    }


    public void runBuild(String url, String buildId) {
        Build build = new Build();
        BuildType buildType = new BuildType();
        buildType.setId(buildId);
        build.setBuildType(buildType);

        WebResource webResource = getClient().resource(url);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).post(ClientResponse.class, build);
        System.out.println(response.getStatus());
    }
}
