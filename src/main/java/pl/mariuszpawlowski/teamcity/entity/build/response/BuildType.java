package pl.mariuszpawlowski.teamcity.entity.build.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
@XmlRootElement(name = "buildType")
public class BuildType
{
    private String id;

    private String webUrl;

    private String name;

    private String projectId;

    private String projectName;

    private String href;

    @XmlAttribute
    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @XmlAttribute
    public String getWebUrl ()
    {
        return webUrl;
    }

    public void setWebUrl (String webUrl)
    {
        this.webUrl = webUrl;
    }

    @XmlAttribute
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @XmlAttribute
    public String getProjectId ()
    {
        return projectId;
    }

    public void setProjectId (String projectId)
    {
        this.projectId = projectId;
    }

    @XmlAttribute
    public String getProjectName ()
    {
        return projectName;
    }

    public void setProjectName (String projectName)
    {
        this.projectName = projectName;
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
        return "ClassPojo [id = "+id+", webUrl = "+webUrl+", name = "+name+", projectId = "+projectId+", projectName = "+projectName+", href = "+href+"]";
    }
}