package com.example.csdj.branch.controller;

import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
*信息核对
* */
@RequestMapping("/branch")
@Controller
public class CheckingLnformationController extends BaseController {
@SysLog("进入到信息核对首页")
@RequestMapping("checkInformation")
    public String checkInformation(){
    return "/branch/experience/experienceIndex";
}
@SysLog("进入信息核对详情页")
@RequestMapping("checkInformationDetail")
    public String checkInformationDetail(){
    return "/branch/experience/experienceDetail";
}

}
