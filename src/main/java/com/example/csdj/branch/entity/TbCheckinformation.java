package com.example.csdj.branch.entity;

import java.util.Date;

public class TbCheckinformation {
    /**
     * 主键
     */
    private Integer check_id;

    /**
     * 审核时间
     */
    private Date check_time;

    /**
     * 被审核党员
     */
    private Integer member_id;

    /**
     * 审核人，党支部外键
     */
    private Integer department_id;

    public Integer getCheck_id() {
        return check_id;
    }

    public void setCheck_id(Integer check_id) {
        this.check_id = check_id;
    }

    public Date getCheck_time() {
        return check_time;
    }

    public void setCheck_time(Date check_time) {
        this.check_time = check_time;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }
}