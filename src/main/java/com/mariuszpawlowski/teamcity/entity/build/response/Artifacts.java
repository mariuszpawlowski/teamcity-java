package com.mariuszpawlowski.teamcity.entity.build.response;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
public class Artifacts
{
    private String href;

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
        return "ClassPojo [href = "+href+"]";
    }
}
