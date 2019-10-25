package com.example.csdj.committee.controller;

import com.example.csdj.committee.entity.Issue;
import com.example.csdj.committee.entity.Survey;
import com.example.csdj.committee.entity.Types;
import com.example.csdj.committee.service.SurveyService;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SurveyController extends BaseController {
@Autowired
private SurveyService surveyService;

    @RequestMapping("/in")
    public String index() {

        return "committee/index";
    }

    //问卷管理
    @RequestMapping("/addsurvey")
    public String addSurvey() {

        return "committee/wjdc/addSurvey";
    }
    @PostMapping("/addsur")
    @ResponseBody
    public String adds(Survey survey){
        System.out.println(survey);
        if (surveyService.addSurvey(survey)){
            return dealSuccessResutl("添加成功",survey);

        }
        return null;
    }
    @PostMapping("/getAllType")
    @ResponseBody
    public String getAllProducts() {
        List<Types> types=surveyService.findType();
        System.out.println(types);
        return dealQueryResult(types,types);
    }

    @RequestMapping("/Survey")
    public String findSurvey(Model model) {
        List<Survey> surveys=surveyService.findSurvey();
        System.out.println(surveys);
        model.addAttribute("surveys",surveys);
        return "committee/wjdc/findSurvey";
    }
    @RequestMapping("/squestion")
    public String addQuestion(int id,Model model) {
        List<Issue> issues=surveyService.findSurveyById(id);
        model.addAttribute("issues",issues);
        return "committee/wjdc/addQuestion";
    }
    @PostMapping("/addissue")
    @ResponseBody
    public String addIssue(Issue issue){
        System.out.println(issue);
        if (surveyService.addIssue(issue)){
            return dealSuccessResutl("添加成功",issue);
        }
        return null;
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


