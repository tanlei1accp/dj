package com.example.csdj.committee.entity;

import java.util.Date;

public class DocumentLearn {

    private int docuid;
    private String docutitle;
    private String docucontent;
    private int docustate;  //0未发布 1已发布
    private Date createdate;
    private String createpeo;
    private Date updatedate;
    private String updatepeople;
    private int deletetag;   //0未删除 1已删除

    public int getDocuid() {
        return docuid;
    }

    public void setDocuid(int docuid) {
        this.docuid = docuid;
    }

    public String getDocutitle() {
        return docutitle;
    }

    public void setDocutitle(String docutitle) {
        this.docutitle = docutitle;
    }

    public String getDocucontent() {
        return docucontent;
    }

    public void setDocucontent(String docucontent) {
        this.docucontent = docucontent;
    }

    public int getDocustate() {
        return docustate;
    }

    public void setDocustate(int docustate) {
        this.docustate = docustate;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreatepeo() {
        return createpeo;
    }

    public void setCreatepeo(String createpeo) {
        this.createpeo = createpeo;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
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
