package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 党员管理
 */
@RequestMapping("/branch")
@Controller
public class PartyMemberController extends BaseController {

    /**
     * 进入到党员管理页面
     * @return
     */
    @RequestMapping("/partyMemberManage")
    public String partyMemberManage() {
        return "/branch/memberManagement/memberManage";
    }
    @RequestMapping("/memberDetails")
    public String memberDetails() {
        return "/branch/memberManagement/memberDetails";
    }
    @RequestMapping("/memberUpdate")
    public String memberUpdate() {
        return "/branch/memberManagement/memberUpdate";
    }
    @RequestMapping("/audit")
    public String audit() {
        return "/branch/memberManagement/audit";
    }
    @RequestMapping("/memberAdd")
    public String memberAdd() {
        return "/branch/memberManagement/memberAdd";
    }
}
