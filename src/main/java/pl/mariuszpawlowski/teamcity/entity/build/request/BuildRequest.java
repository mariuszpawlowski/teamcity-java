package pl.mariuszpawlowski.teamcity.entity.build.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mario on 22/11/15.
 */
@XmlRootElement(name = "build")
public class BuildRequest {

    private BuildType buildType;

    @XmlElement
    public BuildType getBuildType() {
        return buildType;
    }

    public void setBuildType(BuildType buildType) {
        this.buildType = buildType;
    }
}
