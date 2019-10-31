package com.example.csdj.member.entity;

import java.util.Date;

/**
 * 党内公示（谢春媛）
 */
public class PublicPublicity {
    private Integer publicityId;
    private String publicityName;//标题
    private String publicityContent;//内容
    private Date publicityTime;//发布时间
    private Integer publicityIssueTime;//是否发布，0未发布，1已发布
    private String publicityCreate;//创建者
    private Date publicityCreateTime;//创建时间
    private String publicityModifier;//修改者
    private Date publicityModifyTime;//修改时间
    private Integer publicityDeleteFlag;//删除标记，0未删除，1已删除

    public Integer getPublicityId() {
        return publicityId;
    }

    public void setPublicityId(Integer publicityId) {
        this.publicityId = publicityId;
    }

    public String getPublicityName() {
        return publicityName;
    }

    public void setPublicityName(String publicityName) {
        this.publicityName = publicityName;
    }

    public String getPublicityContent() {
        return publicityContent;
    }

    public void setPublicityContent(String publicityContent) {
        this.publicityContent = publicityContent;
    }

    public Date getPublicityTime() {
        return publicityTime;
    }

    public void setPublicityTime(Date publicityTime) {
        this.publicityTime = publicityTime;
    }

    public Integer getPublicityIssueTime() {
        return publicityIssueTime;
    }

    public void setPublicityIssueTime(Integer publicityIssueTime) {
        this.publicityIssueTime = publicityIssueTime;
    }

    public String getPublicityCreate() {
        return publicityCreate;
    }

    public void setPublicityCreate(String publicityCreate) {
        this.publicityCreate = publicityCreate;
    }

    public Date getPublicityCreateTime() {
        return publicityCreateTime;
    }

    public void setPublicityCreateTime(Date publicityCreateTime) {
        this.publicityCreateTime = publicityCreateTime;
    }

    public String getPublicityModifier() {
        return publicityModifier;
    }

    public void setPublicityModifier(String publicityModifier) {
        this.publicityModifier = publicityModifier;
    }

    public Date getPublicityModifyTime() {
        return publicityModifyTime;
    }

    public void setPublicityModifyTime(Date publicityModifyTime) {
        this.publicityModifyTime = publicityModifyTime;
    }

    public Integer getPublicityDeleteFlag() {
        return publicityDeleteFlag;
    }

    public void setPublicityDeleteFlag(Integer publicityDeleteFlag) {
        this.publicityDeleteFlag = publicityDeleteFlag;
    }

    public PublicPublicity() {
    }

    public PublicPublicity(Integer publicityId, String publicityName, String publicityContent, Date publicityTime, Integer publicityIssueTime, String publicityCreate, Date publicityCreateTime, String publicityModifier, Date publicityModifyTime, Integer publicityDeleteFlag) {
        this.publicityId = publicityId;
        this.publicityName = publicityName;
        this.publicityContent = publicityContent;
        this.publicityTime = publicityTime;
        this.publicityIssueTime = publicityIssueTime;
        this.publicityCreate = publicityCreate;
        this.publicityCreateTime = publicityCreateTime;
        this.publicityModifier = publicityModifier;
        this.publicityModifyTime = publicityModifyTime;
        this.publicityDeleteFlag = publicityDeleteFlag;
    }

    @Override
    public String toString() {
        return "PublicPublicity{" +
                "publicityId=" + publicityId +
                ", publicityName='" + publicityName + '\'' +
                ", publicityContent='" + publicityContent + '\'' +
                ", publicityTime=" + publicityTime +
                ", publicityIssueTime=" + publicityIssueTime +
                ", publicityCreate='" + publicityCreate + '\'' +
                ", publicityCreateTime=" + publicityCreateTime +
                ", publicityModifier='" + publicityModifier + '\'' +
                ", publicityModifyTime=" + publicityModifyTime +
                ", publicityDeleteFlag=" + publicityDeleteFlag +
                '}';
    }
}
