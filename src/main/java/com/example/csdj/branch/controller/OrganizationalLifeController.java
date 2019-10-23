package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 组织生活
 * */
@RequestMapping("/branch")
@Controller
public class OrganizationalLifeController extends BaseController {
    @RequestMapping("organizationalLife")
    public String organizationalLife(){
        return "/branch/life/lifeList";
    }
    @RequestMapping("addOrganizationalLife")
    public String addOrganizationalLife(){
        return "/branch/life/lifeAdd";
    }
    @RequestMapping("updateOrganizationalLife")
    public String updateOrganizationalLife(){
        return "/branch/life/lifeUpdate";
    }
}
