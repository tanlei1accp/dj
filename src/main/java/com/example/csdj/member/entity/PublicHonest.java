package com.example.csdj.member.entity;

import java.util.Date;

/**
 * 党风廉政（谢春媛）
 */
public class PublicHonest {
    private Integer honestId;
    private String honestName;//标题
    private String honestContent;//内容
    private Date honestTime;//发布时间
    private Integer honestIssueTime;//是否发布，0未发布，1已发布
    private String honestCreate;//创建者
    private Date honestCreateTime;//创建时间
    private String honestModifier;//修改者
    private Date honestModifyTime;//修改时间
    private Integer honestDeleteFlag;//删除标记，0未删除，1已删除

    public Integer getHonestId() {
        return honestId;
    }

    public void setHonestId(Integer honestId) {
        this.honestId = honestId;
    }

    public String getHonestName() {
        return honestName;
    }

    public void setHonestName(String honestName) {
        this.honestName = honestName;
    }

    public String getHonestContent() {
        return honestContent;
    }

    public void setHonestContent(String honestContent) {
        this.honestContent = honestContent;
    }

    public Date getHonestTime() {
        return honestTime;
    }

    public void setHonestTime(Date honestTime) {
        this.honestTime = honestTime;
    }

    public Integer getHonestIssueTime() {
        return honestIssueTime;
    }

    public void setHonestIssueTime(Integer honestIssueTime) {
        this.honestIssueTime = honestIssueTime;
    }

    public String getHonestCreate() {
        return honestCreate;
    }

    public void setHonestCreate(String honestCreate) {
        this.honestCreate = honestCreate;
    }

    public Date getHonestCreateTime() {
        return honestCreateTime;
    }

    public void setHonestCreateTime(Date honestCreateTime) {
        this.honestCreateTime = honestCreateTime;
    }

    public String getHonestModifier() {
        return honestModifier;
    }

    public void setHonestModifier(String honestModifier) {
        this.honestModifier = honestModifier;
    }

    public Date getHonestModifyTime() {
        return honestModifyTime;
    }

    public void setHonestModifyTime(Date honestModifyTime) {
        this.honestModifyTime = honestModifyTime;
    }

    public Integer getHonestDeleteFlag() {
        return honestDeleteFlag;
    }

    public void setHonestDeleteFlag(Integer honestDeleteFlag) {
        this.honestDeleteFlag = honestDeleteFlag;
    }

    public PublicHonest() {
    }

    public PublicHonest(Integer honestId, String honestName, String honestContent, Date honestTime, Integer honestIssueTime, String honestCreate, Date honestCreateTime, String honestModifier, Date honestModifyTime, Integer honestDeleteFlag) {
        this.honestId = honestId;
        this.honestName = honestName;
        this.honestContent = honestContent;
        this.honestTime = honestTime;
        this.honestIssueTime = honestIssueTime;
        this.honestCreate = honestCreate;
        this.honestCreateTime = honestCreateTime;
        this.honestModifier = honestModifier;
        this.honestModifyTime = honestModifyTime;
        this.honestDeleteFlag = honestDeleteFlag;
    }

    @Override
    public String toString() {
        return "PublicHonest{" +
                "honestId=" + honestId +
                ", honestName='" + honestName + '\'' +
                ", honestContent='" + honestContent + '\'' +
                ", honestTime=" + honestTime +
                ", honestIssueTime=" + honestIssueTime +
                ", honestCreate='" + honestCreate + '\'' +
                ", honestCreateTime=" + honestCreateTime +
                ", honestModifier='" + honestModifier + '\'' +
                ", honestModifyTime=" + honestModifyTime +
                ", honestDeleteFlag=" + honestDeleteFlag +
                '}';
    }
}
