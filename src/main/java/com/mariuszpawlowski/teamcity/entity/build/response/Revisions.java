package com.mariuszpawlowski.teamcity.entity.build.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
@XmlRootElement(name = "revisions")
public class Revisions
{
    private String count;

    @XmlElement
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

