package com.example.csdj.member.entity;

public class Note {
    private int nid;
    private String nname;
    private String ncontent;
    private int cid;
    private int mid;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Note{" +
                "nid=" + nid +
                ", nname='" + nname + '\'' +
                ", ncontent='" + ncontent + '\'' +
                ", cid=" + cid +
                ", mid=" + mid +
                '}';
    }
}
