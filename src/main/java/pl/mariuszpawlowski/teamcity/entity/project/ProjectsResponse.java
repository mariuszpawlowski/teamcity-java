package pl.mariuszpawlowski.teamcity.entity.project;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mario on 22/11/15.
 */
@XmlRootElement(name = "projects")
public class ProjectsResponse
{
    private ProjectResponse[] project;

    private String count;

    private String href;

    @XmlElement(name="project")
    public ProjectResponse[] getProject ()
    {
        return project;
    }

    public void setProject (ProjectResponse[] project)
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