package com.example.csdj.member.controller;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;

    @RequestMapping("/indexMemberLogin")
    @ResponseBody
    public String indexMemberLogin(Member member){

        memberService.memberLogin(member);
    return "true";
    }
    @RequestMapping("/memberLogin")
    public String memberLogin(ModelMap model,HttpSession session, Member member){

        if(memberService.memberLogin(member)==null){
            model.put("message","登录失败");
            return "member/index";
        }
          else{
            session.setAttribute("member",memberService.memberLogin(member));
            model.put("message","登录成功");
            return "member/index";
        }



    }
}
