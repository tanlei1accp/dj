package com.example.csdj.member.controller;

import com.example.csdj.committee.entity.DocumentLearn;
import com.example.csdj.committee.entity.MeritorDeed;
import com.example.csdj.committee.entity.PioneerColumn;
import com.example.csdj.committee.service.XFZLService;
import com.example.csdj.committee.service.XJSJService;
import com.example.csdj.committee.service.XXJYService;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController extends BaseController {

    @Autowired
    MemberService memberService;

    //先锋专栏
    @Autowired
    private XFZLService xfzlService;

    //先进事迹
    @Autowired
    private XJSJService xjsjService;

    //文件学习
    @Autowired
    private XXJYService xxjyService;

    @RequestMapping("/")
    public String index(Model model) {
        memberService.addPartyMember();
        //先锋专栏
        List<PioneerColumn> xflist= xfzlService.findByNdYb();//拿到已发布未删除的数据List<PioneerColumn> xflist=
        model.addAttribute("xflist",xflist);
        //先进事迹
        List<MeritorDeed> deedList= xjsjService.findByNdYb();
        model.addAttribute("deedList",deedList);
        //学习教育
        List<DocumentLearn> learnList= xxjyService.findByNdYb();
        model.addAttribute("learnList",learnList);
        return "member/index.html";
    }

    @RequestMapping("/index")
    public String myIndex() {
        return "index";
    }

    @RequestMapping("/userlogin")
    public String userLogin(HttpSession session) {
        session.setAttribute("admin","admin");
        System.out.println("创建session"+session);
        return "member/login";
    }
    //个人中心
    @RequestMapping("/personCenter")
    public String personCenter() {

        return "member/personCenter/updateindex";
    }
    //党务公开
    @RequestMapping("/dflzList")
    public String dflzList() {

        return "member/partyOpenness/publicDflzList";
    }
    @RequestMapping("/dngsList")
    public String dngsList() {

        return "member/partyOpenness/publicDngsList";
    }
    @RequestMapping("/xdthList")
    public String xdthList() {

        return "member/partyOpenness/publicXdthList";
    }
    @RequestMapping("/ffclList")
    public String ffclList() {

        return "member/partyOpenness/publicFfclList";
    }

    @RequestMapping("/inboxEmail")
    public String inboxEmail() {

        return "member/inboxMail/inboxEmail";
    }

    @RequestMapping("/notice")
    public String notice() {
        System.out.println("调到collection层");
        return "member/notice";
    }

    @RequestMapping("/chattest")
    public String chattest() {
        System.out.println("调到collection层");
        return "member/chat";
    }
}
