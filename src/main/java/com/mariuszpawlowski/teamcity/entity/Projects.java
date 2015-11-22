package com.mariuszpawlowski.teamcity.entity;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mario on 22/11/15.
 */
@XmlRootElement(name = "projects")
public class Projects
{
    private Project[] project;

    private String count;

    private String href;

    @XmlElement(name="project")
    public Project[] getProject ()
    {
        return project;
    }

    public void setProject (Project[] project)
    {
        this.project = project;
    }

    @XmlAttribute
    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    @XmlAttribute
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
        return "ClassPojo [project = "+project+", count = "+count+", href = "+href+"]";
    }
}