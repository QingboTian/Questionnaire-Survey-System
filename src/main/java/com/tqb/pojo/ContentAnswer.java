package com.tqb.pojo;

public class ContentAnswer {
    private Integer caId;

    private String caAnswer;

    private Integer cId;

    public Integer getCaId() {
        return caId;
    }

    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    public String getCaAnswer() {
        return caAnswer;
    }

    public void setCaAnswer(String caAnswer) {
        this.caAnswer = caAnswer == null ? null : caAnswer.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}