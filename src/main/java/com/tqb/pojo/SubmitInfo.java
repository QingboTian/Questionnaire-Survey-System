package com.tqb.pojo;

public class SubmitInfo {
    private Integer siId;

    private String siIp;

    private String siLocation;

    private String siDate;

    private String qId;

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public String getSiIp() {
        return siIp;
    }

    public void setSiIp(String siIp) {
        this.siIp = siIp == null ? null : siIp.trim();
    }

    public String getSiLocation() {
        return siLocation;
    }

    public void setSiLocation(String siLocation) {
        this.siLocation = siLocation == null ? null : siLocation.trim();
    }

    public String getSiDate() {
        return siDate;
    }

    public void setSiDate(String siDate) {
        this.siDate = siDate == null ? null : siDate.trim();
    }

    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId == null ? null : qId.trim();
    }
}