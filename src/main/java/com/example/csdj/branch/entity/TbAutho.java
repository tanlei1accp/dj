package com.example.csdj.branch.entity;

public class TbAutho {
    /**
     * 主键
     */
    private Integer a_id;

    /**
     * 权限名称
     */
    private String a_name;

    /**
     * 权限等级
     */
    private Integer a_level;

    /**
     * 二级ID
     */
    private Integer a_fatherId;

    /**
     * 
     */
    private String a_perms;

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name == null ? null : a_name.trim();
    }

    public Integer getA_level() {
        return a_level;
    }

    public void setA_level(Integer a_level) {
        this.a_level = a_level;
    }

    public Integer getA_fatherId() {
        return a_fatherId;
    }

    public void setA_fatherId(Integer a_fatherId) {
        this.a_fatherId = a_fatherId;
    }

    public String getA_perms() {
        return a_perms;
    }

    public void setA_perms(String a_perms) {
        this.a_perms = a_perms == null ? null : a_perms.trim();
    }
}