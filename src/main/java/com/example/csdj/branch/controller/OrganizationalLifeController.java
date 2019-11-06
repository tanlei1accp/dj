package com.example.csdj.branch.controller;

import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 组织生活
 * */
@RequestMapping("/branch")
@Controller
public class OrganizationalLifeController extends BaseController {
    @SysLog("查看所有组织生活")
    @RequestMapping("organizationalLife")

    public String organizationalLife(){
        return "/branch/life/lifeList";
    }
    @SysLog("添加组织生活")
    @RequestMapping("addOrganizationalLife")
    public String addOrganizationalLife(){
        return "/branch/life/lifeAdd";
    }
    @SysLog("更新组织生活")
    @RequestMapping("updateOrganizationalLife")
    public String updateOrganizationalLife(){
        return "/branch/life/lifeUpdate";
    }
}
