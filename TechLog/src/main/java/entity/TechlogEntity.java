package entity;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "techlog", schema = "GoaaTech", catalog = "")
public class TechlogEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "lane")
    private String lane;
    @Basic
    @Column(name = "reportTime")
    private Time reportTime;
    @Basic
    @Column(name = "startTime")
    private Time startTime;
    @Basic
    @Column(name = "stopTime")
    private Time stopTime;
    @Basic
    @Column(name = "reportedProb")
    private String reportedProb;
    @Basic
    @Column(name = "actualProb")
    private String actualProb;
    @Basic
    @Column(name = "actionTaken")
    private String actionTaken;
    @Basic
    @Column(name = "techNum")
    private Integer techNum;
    @Basic
    @Column(name = "skidata", columnDefinition = "TINYINT(1)")
    private boolean skidata;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Time getReportTime() {
        return reportTime;
    }

    public void setReportTime(Time reportTime) {
        this.reportTime = reportTime;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getStopTime() {
        return stopTime;
    }

    public void setStopTime(Time stopTime) {
        this.stopTime = stopTime;
    }

    public String getReportedProb() {
        return reportedProb;
    }

    public void setReportedProb(String reportedProb) {
        this.reportedProb = reportedProb;
    }

    public String getActualProb() {
        return actualProb;
    }

    public void setActualProb(String actualProb) {
        this.actualProb = actualProb;
    }

    public String getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(String actionTaken) {
        this.actionTaken = actionTaken;
    }

    public Integer getTechNum() {
        return techNum;
    }

    public void setTechNum(Integer techNum) {
        this.techNum = techNum;
    }

    public boolean getSkidata() {
        return skidata;
    }

    public void setSkidata(boolean skidata) {
        this.skidata = skidata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TechlogEntity that = (TechlogEntity) o;

        if (id != that.id) return false;
        if (lane != null ? !lane.equals(that.lane) : that.lane != null) return false;
        if (reportTime != null ? !reportTime.equals(that.reportTime) : that.reportTime != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (stopTime != null ? !stopTime.equals(that.stopTime) : that.stopTime != null) return false;
        if (reportedProb != null ? !reportedProb.equals(that.reportedProb) : that.reportedProb != null) return false;
        if (actualProb != null ? !actualProb.equals(that.actualProb) : that.actualProb != null) return false;
        if (actionTaken != null ? !actionTaken.equals(that.actionTaken) : that.actionTaken != null) return false;
        if (techNum != null ? !techNum.equals(that.techNum) : that.techNum != null) return false;
        if (skidata != that.skidata) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lane != null ? lane.hashCode() : 0);
        result = 31 * result + (reportTime != null ? reportTime.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (stopTime != null ? stopTime.hashCode() : 0);
        result = 31 * result + (reportedProb != null ? reportedProb.hashCode() : 0);
        result = 31 * result + (actualProb != null ? actualProb.hashCode() : 0);
        result = 31 * result + (actionTaken != null ? actionTaken.hashCode() : 0);
        result = 31 * result + (techNum != null ? techNum.hashCode() : 0);
        result = 31 * result + (skidata ? 1 : 0);
        return result;
    }
}
