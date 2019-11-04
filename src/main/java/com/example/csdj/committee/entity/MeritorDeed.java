package com.example.csdj.committee.entity;

import java.util.Date;

public class MeritorDeed {

    private int deedid;
    private String deedtitle;
    private String deedcontent;
    private int deedstate;     //0未发布 1已发布
    private Date createtime;
    private String createpeople;
    private Date updatetime;
    private String updatepeople;
    private int deleteflag;    //0未删除 1已删除

    public int getDeedid() {
        return deedid;
    }

    public void setDeedid(int deedid) {
        this.deedid = deedid;
    }

    public String getDeedtitle() {
        return deedtitle;
    }

    public void setDeedtitle(String deedtitle) {
        this.deedtitle = deedtitle;
    }

    public String getDeedcontent() {
        return deedcontent;
    }

    public void setDeedcontent(String deedcontent) {
        this.deedcontent = deedcontent;
    }

    public int getDeedstate() {
        return deedstate;
    }

    public void setDeedstate(int deedstate) {
        this.deedstate = deedstate;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreatepeople() {
        return createpeople;
    }

    public void setCreatepeople(String createpeople) {
        this.createpeople = createpeople;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatepeople() {
        return updatepeople;
    }

    public void setUpdatepeople(String updatepeople) {
        this.updatepeople = updatepeople;
    }

    public int getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(int deleteflag) {
        this.deleteflag = deleteflag;
    }
}
