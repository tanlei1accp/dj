package com.example.csdj.branch.entity;

public class TbFamily {
    /**
     * 
     */
    private Integer family_id;

    /**
     * 姓名
     */
    private String family_name;

    /**
     * 关系
     */
    private String relation;

    /**
     * 年龄
     */
    private Integer family_age;

    /**
     * 电话
     */
    private Integer family_phone;

    /**
     * 党员外键
     */
    private Member member;

    /**
     * 身体情况
     */
    private String physical;

    public Integer getFamily_id() {
        return family_id;
    }

    public void setFamily_id(Integer family_id) {
        this.family_id = family_id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name == null ? null : family_name.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public Integer getFamily_age() {
        return family_age;
    }

    public void setFamily_age(Integer family_age) {
        this.family_age = family_age;
    }

    public Integer getFamily_phone() {
        return family_phone;
    }

    public void setFamily_phone(Integer family_phone) {
        this.family_phone = family_phone;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getPhysical() {
        return physical;
    }

    public void setPhysical(String physical) {
        this.physical = physical == null ? null : physical.trim();
    }
}