package com.tqb.pojo;

public class Questionnaire {
    private String qId;

    private String qName;

    private String qCreatedate;

    private Boolean qState;

    private Integer qCount;

    private String qRemark;

    private Integer qTime;

    private String uId;

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName == null ? null : qName.trim();
    }

    public String getqCreatedate() {
        return qCreatedate;
    }

    public void setqCreatedate(String qCreatedate) {
        this.qCreatedate = qCreatedate == null ? null : qCreatedate.trim();
    }

    public Boolean getqState() {
        return qState;
    }

    public void setqState(Boolean qState) {
        this.qState = qState;
    }

    public Integer getqCount() {
        return qCount;
    }

    public void setqCount(Integer qCount) {
        this.qCount = qCount;
    }

    public String getqRemark() {
        return qRemark;
    }

    public void setqRemark(String qRemark) {
        this.qRemark = qRemark == null ? null : qRemark.trim();
    }

    public Integer getqTime() {
        return qTime;
    }

    public void setqTime(Integer qTime) {
        this.qTime = qTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }
}