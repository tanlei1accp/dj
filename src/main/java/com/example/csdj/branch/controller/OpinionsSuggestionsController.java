package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
* 意见建议
* */
@RequestMapping("/branch")
@Controller
public class OpinionsSuggestionsController extends BaseController {
    @RequestMapping("opinionsSuggestions")
    public String opinionsSuggestions(){
        return "/branch/advice/adviceIndex";
    }
    @RequestMapping("opinionsSuggestionsDetail")
    public String opinionsSuggestionsDetail(){
        return "/branch/advice/adviceDetail";
    }
    @RequestMapping("opinionsSuggestionsReply")
    public String opinionsSuggestionsReply(){
        return "/branch/advice/adviceReply";
    }
}
