package com.mariuszpawlowski.teamcity.entity.build.response;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
public class Revisions
{
    private String count;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [count = "+count+"]";
    }
}

