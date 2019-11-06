package com.example.csdj.branch.controller;

import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 心得体会
* */
@RequestMapping("/branch")
@Controller
public class FeelingsExperiencesController  extends BaseController {
    @SysLog("心得体会首页")
    @RequestMapping("feelingsExperiences")
    public String feelingsExperiences(){
        return "/branch/informationCheck/informationCheckIndex";
    }
    @SysLog("心得体会详情页")
    @RequestMapping("feelingsExperiencesDetail")
    public String feelingsExperiencesDetail(){
        return "/branch/informationCheck/informationCheckDetail";
    }
}
