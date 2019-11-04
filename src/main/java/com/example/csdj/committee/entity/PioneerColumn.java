package com.example.csdj.committee.entity;

import java.util.Date;

public class PioneerColumn {

    private int pioneerid;
    private String pioneertitle;
    private String pioneercontent;
    private int pioneerstate;   //0未发布 1已发布
    private Date createtime;
    private String createpeople;
    private Date updatetime;
    private String updatepeople;
    private int deletetag;     //0未删除  1已删除

    public int getPioneerid() {
        return pioneerid;
    }

    public void setPioneerid(int pioneerid) {
        this.pioneerid = pioneerid;
    }

    public String getPioneertitle() {
        return pioneertitle;
    }

    public void setPioneertitle(String pioneertitle) {
        this.pioneertitle = pioneertitle;
    }

    public String getPioneercontent() {
        return pioneercontent;
    }

    public void setPioneercontent(String pioneercontent) {
        this.pioneercontent = pioneercontent;
    }

    public int getPioneerstate() {
        return pioneerstate;
    }

    public void setPioneerstate(int pioneerstate) {
        this.pioneerstate = pioneerstate;
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

    public int getDeletetag() {
        return deletetag;
    }

    public void setDeletetag(int deletetag) {
        this.deletetag = deletetag;
    }
}
