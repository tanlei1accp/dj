package com.example.csdj.committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("partyMemberManagement")
public class DangWuGuanLiController {
    @RequestMapping("list")
    public String list(){
        return "committee/dwgl/list";
    }
    @RequestMapping("department_list")
    public String department_list(){
        return "committee/dwgl/department_list";
    }
    @RequestMapping("life-committee")
    public String life_committee(){
        return "committee/dwgl/life-committee";
    }
    @RequestMapping("check")
    public String check(){
        return "committee/dwgl/check";
    }
    @RequestMapping("money-committee")
    public String money_committee(){
        return "committee/dwgl/money-committee";
    }
    @RequestMapping("audit")
    public String audit(){
        return "committee/dwgl/audit";
    }
    @RequestMapping("audit_over")
    public String audit_over(){
        return "committee/dwgl/audit_over";
    }
    @RequestMapping("member")
    public String membermember(){
        return  "committee/dwgl/member";
    }
    @RequestMapping("add")
    public String add(){
        return "committee/dwgl/add";
    }
    @RequestMapping("audit_member")
    public String audit_member(){
        return "committee/dwgl/audit_member";
    }
    @RequestMapping("department_update")
    public String department_update(){
        return "committee/dwgl/department_update";
    }
    @RequestMapping("update")
    public String update(){
        return "committee/dwgl/update";
    }
    @RequestMapping("log")
    public String log(){
       return "committee/dwgl/log" ;
    }


}
