package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
}
