package com.mariuszpawlowski.teamcity.entity.build.response;

/**
 * Created by mario on 22/11/15.
 */
public class RunBuildResponse {
    private String id;

    private BuildType buildType;

    private String queuedDate;

    private CompatibleAgents compatibleAgents;

    private String webUrl;

    private String buildTypeId;

    private String state;

    private String startEstimate;

    private Revisions revisions;

    private String href;

    private Triggered triggered;

    private Artifacts artifacts;

    private Changes changes;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public BuildType getBuildType ()
    {
        return buildType;
    }

    public void setBuildType (BuildType buildType)
    {
        this.buildType = buildType;
    }

    public String getQueuedDate ()
    {
        return queuedDate;
    }

    public void setQueuedDate (String queuedDate)
    {
        this.queuedDate = queuedDate;
    }

    public CompatibleAgents getCompatibleAgents ()
    {
        return compatibleAgents;
    }

    public void setCompatibleAgents (CompatibleAgents compatibleAgents)
    {
        this.compatibleAgents = compatibleAgents;
    }

    public String getWebUrl ()
    {
        return webUrl;
    }

    public void setWebUrl (String webUrl)
    {
        this.webUrl = webUrl;
    }

    public String getBuildTypeId ()
    {
        return buildTypeId;
    }

    public void setBuildTypeId (String buildTypeId)
    {
        this.buildTypeId = buildTypeId;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getStartEstimate ()
    {
        return startEstimate;
    }

    public void setStartEstimate (String startEstimate)
    {
        this.startEstimate = startEstimate;
    }

    public Revisions getRevisions ()
    {
        return revisions;
    }

    public void setRevisions (Revisions revisions)
    {
        this.revisions = revisions;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public Triggered getTriggered ()
    {
        return triggered;
    }

    public void setTriggered (Triggered triggered)
    {
        this.triggered = triggered;
    }

    public Artifacts getArtifacts ()
    {
        return artifacts;
    }

    public void setArtifacts (Artifacts artifacts)
    {
        this.artifacts = artifacts;
    }

    public Changes getChanges ()
    {
        return changes;
    }

    public void setChanges (Changes changes)
    {
        this.changes = changes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", buildType = "+buildType+", queuedDate = "+queuedDate+", compatibleAgents = "+compatibleAgents+", webUrl = "+webUrl+", buildTypeId = "+buildTypeId+", state = "+state+", startEstimate = "+startEstimate+", revisions = "+revisions+", href = "+href+", triggered = "+triggered+", artifacts = "+artifacts+", changes = "+changes+"]";
    }
}