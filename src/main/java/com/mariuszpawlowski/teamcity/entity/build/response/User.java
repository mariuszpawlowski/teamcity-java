package com.mariuszpawlowski.teamcity.entity.build.response;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
public class User
{
    private String id;

    private String username;

    private String name;

    private String href;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [id = "+id+", username = "+username+", name = "+name+", href = "+href+"]";
    }
}
