package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
*信息核对
* */
@RequestMapping("/branch")
@Controller
public class CheckingLnformationController extends BaseController {
@RequestMapping("checkInformation")
    public String checkInformation(){
    return "/branch/experience/experienceIndex";
}
@RequestMapping("checkInformationDetail")
    public String checkInformationDetail(){

    return "/branch/experience/experienceDetail";
}

}
