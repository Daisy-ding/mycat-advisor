package org.apache.mycat.advisor.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by cjl on 2016/3/20.
 */
@Table(name = "examine_step")
public class ExamineStep {
    private Long examineid;
    private Integer templateid;
    private Byte curstep;
    private Long ownerid;
    private Long questionid;
    private String describe;
    private Byte status;
    private Byte priority;
    private Timestamp starttime;
    private Timestamp endtime;
    private Timestamp lastupdatetime;

    @Id
    @Column(name = "examineid", nullable = false, insertable = true, updatable = true)
    public Long getExamineid() {
        return examineid;
    }

    public void setExamineid(Long examineid) {
        this.examineid = examineid;
    }

    @Basic
    @Column(name = "templateid", nullable = true, insertable = true, updatable = true)
    public Integer getTemplateid() {
        return templateid;
    }

    public void setTemplateid(Integer templateid) {
        this.templateid = templateid;
    }

    @Basic
    @Column(name = "curstep", nullable = true, insertable = true, updatable = true)
    public Byte getCurstep() {
        return curstep;
    }

    public void setCurstep(Byte curstep) {
        this.curstep = curstep;
    }

    @Basic
    @Column(name = "ownerid", nullable = true, insertable = true, updatable = true)
    public Long getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Long ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "questionid", nullable = true, insertable = true, updatable = true)
    public Long getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Long questionid) {
        this.questionid = questionid;
    }

    @Basic
    @Column(name = "describe", nullable = true, insertable = true, updatable = true, length = 256)
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Basic
    @Column(name = "status", nullable = true, insertable = true, updatable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "priority", nullable = true, insertable = true, updatable = true)
    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "starttime", nullable = true, insertable = true, updatable = true)
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime", nullable = true, insertable = true, updatable = true)
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "lastupdatetime", nullable = false, insertable = true, updatable = true)
    public Timestamp getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Timestamp lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamineStep that = (ExamineStep) o;

        if (examineid != null ? !examineid.equals(that.examineid) : that.examineid != null) return false;
        if (templateid != null ? !templateid.equals(that.templateid) : that.templateid != null) return false;
        if (curstep != null ? !curstep.equals(that.curstep) : that.curstep != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (questionid != null ? !questionid.equals(that.questionid) : that.questionid != null) return false;
        if (describe != null ? !describe.equals(that.describe) : that.describe != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (starttime != null ? !starttime.equals(that.starttime) : that.starttime != null) return false;
        if (endtime != null ? !endtime.equals(that.endtime) : that.endtime != null) return false;
        if (lastupdatetime != null ? !lastupdatetime.equals(that.lastupdatetime) : that.lastupdatetime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = examineid != null ? examineid.hashCode() : 0;
        result = 31 * result + (templateid != null ? templateid.hashCode() : 0);
        result = 31 * result + (curstep != null ? curstep.hashCode() : 0);
        result = 31 * result + (ownerid != null ? ownerid.hashCode() : 0);
        result = 31 * result + (questionid != null ? questionid.hashCode() : 0);
        result = 31 * result + (describe != null ? describe.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (lastupdatetime != null ? lastupdatetime.hashCode() : 0);
        return result;
    }
}
