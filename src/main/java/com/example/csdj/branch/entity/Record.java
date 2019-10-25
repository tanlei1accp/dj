package com.example.csdj.branch.entity;

public class Record {
    private int reiId;//记录id
    private String event;//事件
    private String reTime;//时间
    private String recordDepartment;//奖惩单位
    private Member member;//党员外键

    public int getReiId() {
        return reiId;
    }

    public void setReiId(int reiId) {
        this.reiId = reiId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getReTime() {
        return reTime;
    }

    public void setReTime(String reTime) {
        this.reTime = reTime;
    }

    public String getRecordDepartment() {
        return recordDepartment;
    }

    public void setRecordDepartment(String recordDepartment) {
        this.recordDepartment = recordDepartment;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
