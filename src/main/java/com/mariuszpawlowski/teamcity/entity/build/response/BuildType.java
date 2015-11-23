package com.mariuszpawlowski.teamcity.entity.build.response;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
public class BuildType
{
    private String id;

    private String webUrl;

    private String name;

    private String projectId;

    private String projectName;

    private String href;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getWebUrl ()
    {
        return webUrl;
    }

    public void setWebUrl (String webUrl)
    {
        this.webUrl = webUrl;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getProjectId ()
    {
        return projectId;
    }

    public void setProjectId (String projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectName ()
    {
        return projectName;
    }

    public void setProjectName (String projectName)
    {
        this.projectName = projectName;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", webUrl = "+webUrl+", name = "+name+", projectId = "+projectId+", projectName = "+projectName+", href = "+href+"]";
    }
}