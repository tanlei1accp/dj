package com.example.csdj.committee.controller;

import com.example.csdj.committee.annotation.SysLog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("committee")
@Controller
public class CommitteeController {
    @SysLog("机关党委主页")
    @RequestMapping("/index")
    public String showIndex(){
        return "committee/index";
    }
}
