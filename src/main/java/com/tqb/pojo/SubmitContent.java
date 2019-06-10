package com.tqb.pojo;

public class SubmitContent {
    private Integer scId;

    private Integer siId;

    private Integer cId;

    private String scAnswer;

    public Integer getScId() {
        return scId;
    }

    public void setScId(Integer scId) {
        this.scId = scId;
    }

    public Integer getSiId() {
        return siId;
    }

    public void setSiId(Integer siId) {
        this.siId = siId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getScAnswer() {
        return scAnswer;
    }

    public void setScAnswer(String scAnswer) {
        this.scAnswer = scAnswer == null ? null : scAnswer.trim();
    }
}