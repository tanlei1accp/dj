package com.example.csdj.committee.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WenJuanDiaoChaController extends BaseController {


    @RequestMapping("/in")
    public String index() {

        return "committee/index";
    }

    //问卷管理
    @RequestMapping("/Survey")
    public String findSurvey() {

        return "committee/wjdc/findSurvey";
    }
    @RequestMapping("/squestion")
    public String addQuestion() {

        return "committee/wjdc/addQuestion";
    }
    @RequestMapping("/sfa")
    public String faBu() {

        return "committee/wjdc/faBu";
    }
    @RequestMapping("/sscore")
    public String score() {

        return "committee/wjdc/score";
    }
    @RequestMapping("/stongji")
    public String tongJi() {

        return "committee/wjdc/tongJi";
    }
}


