package com.example.csdj.committee.controller;

import com.example.csdj.committee.annotation.SysLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("partyMemberManagement")
public class DangWuGuanLiController {
    @SysLog("查看list")
    @RequestMapping("list")
    public String list(){
        return "committee/dwgl/list";
    }
    @SysLog("查看list")
    @RequestMapping("department_list")
    public String department_list(){
        return "committee/dwgl/department_list";
    }
    @SysLog("查看list")
    @RequestMapping("life-committee")
    public String life_committee(){
        return "committee/dwgl/life-committee";
    }
    @SysLog("查看list")
    @RequestMapping("check")
    public String check(){
        return "committee/dwgl/check";
    }
    @SysLog("查看list")
    @RequestMapping("money-committee")
    public String money_committee(){
        return "committee/dwgl/money-committee";
    }
    @SysLog("查看list")
    @RequestMapping("audit")
    public String audit(){
        return "committee/dwgl/audit";
    }
    @SysLog("查看list")
    @RequestMapping("audit_over")
    public String audit_over(){
        return "committee/dwgl/audit_over";
    }
    @SysLog("查看list")
    @RequestMapping("member")
    public String membermember(){
        return  "committee/dwgl/member";
    }
    @SysLog("查看list")
    @RequestMapping("add")
    public String add(){
        return "committee/dwgl/add";
    }
    @SysLog("查看list")
    @RequestMapping("audit_member")
    public String audit_member(){
        return "committee/dwgl/audit_member";
    }
    @SysLog("查看list")
    @RequestMapping("department_update")
    public String department_update(){
        return "committee/dwgl/department_update";
    }
    @SysLog("查看list")
    @RequestMapping("update")
    public String update(){
        return "committee/dwgl/update";
    }
    @SysLog("查看日志")
    @RequestMapping("log")
    public String log(){
       return "committee/dwgl/log" ;
    }


}
