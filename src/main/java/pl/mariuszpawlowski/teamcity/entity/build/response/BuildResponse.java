package pl.mariuszpawlowski.teamcity.entity.build.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mariusz.Pawlowski on 2015-11-23.
 */
@XmlRootElement(name = "build")
public class BuildResponse {

    private String id;
    private String buildTypeId;
    private String href;
    private String webUrl;
    private String status;
    private String state;
    private String number;
    private String queuedDate;
    private String startDate;
    private String finishDate;
    private Triggered triggered;
    private Changes changes;
    private Revisions revisions;

    @XmlAttribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlAttribute
    public String getBuildTypeId() {
        return buildTypeId;
    }

    public void setBuildTypeId(String buildTypeId) {
        this.buildTypeId = buildTypeId;
    }

    @XmlAttribute
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @XmlAttribute
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    @XmlAttribute
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlAttribute
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @XmlAttribute
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @XmlElement
    public String getQueuedDate() {
        return queuedDate;
    }

    public void setQueuedDate(String queuedDate) {
        this.queuedDate = queuedDate;
    }

    @XmlElement
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @XmlElement
    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    @XmlElement
    public Triggered getTriggered() {
        return triggered;
    }

    public void setTriggered(Triggered triggered) {
        this.triggered = triggered;
    }

    @XmlElement
    public Changes getChanges() {
        return changes;
    }

    public void setChanges(Changes changes) {
        this.changes = changes;
    }

    @XmlElement
    public Revisions getRevisions() {
        return revisions;
    }

    public void setRevisions(Revisions revisions) {
        this.revisions = revisions;
    }
}
