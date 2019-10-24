package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/")
    public String index() {
        memberService.addPartyMember();
        return "member/index.html";
    }

    @RequestMapping("/index")
    public String myIndex() {
        return "index";
    }

    @RequestMapping("/userlogin")
    public String userLogin() {

        return "member/login";
    }
    //个人中心新
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
}
