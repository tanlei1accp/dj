package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonalController extends BaseController {
    @Autowired
    PersonalService personalService;
@RequestMapping("mainindex")
    public String mainindex(){
    return "member/index";
}
    @RequestMapping("note")
    public String note(){
        return "member/personCenter/updateblog";
    }
    @RequestMapping("experience")
    public String experience(){
        return "member/personCenter/updateblog";
    }
    @RequestMapping("suggest")
    public String suggest(){
        return "member/personCenter/updateblog";
    }

    @RequestMapping("goupdateindex")
    public String goupdateindex(){
        return "member/personCenter/updateindex";
    }

}
