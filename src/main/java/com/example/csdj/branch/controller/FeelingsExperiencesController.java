package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 心得体会
* */
@RequestMapping("/branch")
@Controller
public class FeelingsExperiencesController  extends BaseController {
    @RequestMapping("feelingsExperiences")
    public String feelingsExperiences(){
        return "/branch/informationCheck/informationCheckIndex";
    }
    @RequestMapping("feelingsExperiencesDetail")
    public String feelingsExperiencesDetail(){
        return "/branch/informationCheck/informationCheckDetail";
    }
}
