package com.example.csdj.member.entity;

import java.util.Date;

/**
 * 反腐倡廉（谢春媛）
 */
public class PublicClean {
    private Integer cleanId;
    private String cleanName;//标题
    private String cleanContent;//内容
    private String cleanImage;//图片
    private Date cleanTime;//发布时间
    private Integer cleanIssueTime;//是否发布，0未发布，1已发布
    private String cleanCreate;//创建者
    private Date cleanCreateTime;//创建时间
    private String cleanModifier;//修改者
    private Date cleanModifyTime;//修改时间
    private Integer cleanDeleteFlag;//删除标记，0未删除，1已删除

    public Integer getCleanId() {
        return cleanId;
    }

    public void setCleanId(Integer cleanId) {
        this.cleanId = cleanId;
    }

    public String getCleanName() {
        return cleanName;
    }

    public void setCleanName(String cleanName) {
        this.cleanName = cleanName;
    }

    public String getCleanContent() {
        return cleanContent;
    }

    public void setCleanContent(String cleanContent) {
        this.cleanContent = cleanContent;
    }

    public String getCleanImage() {
        return cleanImage;
    }

    public void setCleanImage(String cleanImage) {
        this.cleanImage = cleanImage;
    }

    public Date getCleanTime() {
        return cleanTime;
    }

    public void setCleanTime(Date cleanTime) {
        this.cleanTime = cleanTime;
    }

    public Integer getCleanIssueTime() {
        return cleanIssueTime;
    }

    public void setCleanIssueTime(Integer cleanIssueTime) {
        this.cleanIssueTime = cleanIssueTime;
    }

    public String getCleanCreate() {
        return cleanCreate;
    }

    public void setCleanCreate(String cleanCreate) {
        this.cleanCreate = cleanCreate;
    }

    public Date getCleanCreateTime() {
        return cleanCreateTime;
    }

    public void setCleanCreateTime(Date cleanCreateTime) {
        this.cleanCreateTime = cleanCreateTime;
    }

    public String getCleanModifier() {
        return cleanModifier;
    }

    public void setCleanModifier(String cleanModifier) {
        this.cleanModifier = cleanModifier;
    }

    public Date getCleanModifyTime() {
        return cleanModifyTime;
    }

    public void setCleanModifyTime(Date cleanModifyTime) {
        this.cleanModifyTime = cleanModifyTime;
    }

    public Integer getCleanDeleteFlag() {
        return cleanDeleteFlag;
    }

    public void setCleanDeleteFlag(Integer cleanDeleteFlag) {
        this.cleanDeleteFlag = cleanDeleteFlag;
    }

    public PublicClean() {
    }

    public PublicClean(Integer cleanId, String cleanName, String cleanContent, String cleanImage, Date cleanTime, Integer cleanIssueTime, String cleanCreate, Date cleanCreateTime, String cleanModifier, Date cleanModifyTime, Integer cleanDeleteFlag) {
        this.cleanId = cleanId;
        this.cleanName = cleanName;
        this.cleanContent = cleanContent;
        this.cleanImage = cleanImage;
        this.cleanTime = cleanTime;
        this.cleanIssueTime = cleanIssueTime;
        this.cleanCreate = cleanCreate;
        this.cleanCreateTime = cleanCreateTime;
        this.cleanModifier = cleanModifier;
        this.cleanModifyTime = cleanModifyTime;
        this.cleanDeleteFlag = cleanDeleteFlag;
    }

    @Override
    public String toString() {
        return "PublicClean{" +
                "cleanId=" + cleanId +
                ", cleanName='" + cleanName + '\'' +
                ", cleanContent='" + cleanContent + '\'' +
                ", cleanImage='" + cleanImage + '\'' +
                ", cleanTime=" + cleanTime +
                ", cleanIssueTime=" + cleanIssueTime +
                ", cleanCreate='" + cleanCreate + '\'' +
                ", cleanCreateTime=" + cleanCreateTime +
                ", cleanModifier='" + cleanModifier + '\'' +
                ", cleanModifyTime=" + cleanModifyTime +
                ", cleanDeleteFlag=" + cleanDeleteFlag +
                '}';
    }
}
