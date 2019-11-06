package com.example.csdj.branch.controller;

import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 意见建议
* */
@RequestMapping("/branch")
@Controller
public class OpinionsSuggestionsController extends BaseController {
    @SysLog("查看所有意见建议")
    @RequestMapping("opinionsSuggestions")
    public String opinionsSuggestions(){
        return "/branch/advice/adviceIndex";
    }
    @SysLog("查看意见详情")
    @RequestMapping("opinionsSuggestionsDetail")
    public String opinionsSuggestionsDetail(){
        return "/branch/advice/adviceDetail";
    }
    @SysLog("建议回复")
    @RequestMapping("opinionsSuggestionsReply")
    public String opinionsSuggestionsReply(){
        return "/branch/advice/adviceReply";
    }
}
