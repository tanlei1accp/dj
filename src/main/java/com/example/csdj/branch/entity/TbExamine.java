package com.example.csdj.branch.entity;

public class TbExamine {
    /**
     * 
     */
    private Integer examine_id;

    /**
     * 党员外键
     */
    private Integer member;

    /**
     * 提报人
     */
    private String submitter;

    /**
     * 提报时间
     */
    private String submit_time;

    /**
     * 审核人
     */
    private String checker;

    /**
     * 审核时间
     */
    private String examine_time;

    /**
     * 审核意见
     */
    private String auditmind;

    /**
     * 
     */
    private Integer event_flag;

    /**
     * 审核结果
     */
    private String result;

    public Integer getExamine_id() {
        return examine_id;
    }

    public void setExamine_id(Integer examine_id) {
        this.examine_id = examine_id;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter == null ? null : submitter.trim();
    }

    public String getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time == null ? null : submit_time.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getExamine_time() {
        return examine_time;
    }

    public void setExamine_time(String examine_time) {
        this.examine_time = examine_time == null ? null : examine_time.trim();
    }

    public String getAuditmind() {
        return auditmind;
    }

    public void setAuditmind(String auditmind) {
        this.auditmind = auditmind == null ? null : auditmind.trim();
    }

    public Integer getEvent_flag() {
        return event_flag;
    }

    public void setEvent_flag(Integer event_flag) {
        this.event_flag = event_flag;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}