package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.entity.Chat;
import com.example.csdj.branch.entity.Member;
import com.example.csdj.member.service.MemberService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController extends BaseController {
    @Autowired
    MemberService memberService;

   /* @RequestMapping("/indexMemberLogin")
    @ResponseBody
    public String indexMemberLogin(Member member){

        memberService.memberLogin(member);
    return "true";
    }*/
   //党员端首页登录
    @RequestMapping("/memberLogin")
    public String memberLogin(ModelMap model,HttpSession session, Member member){
        System.out.println("跳转成功");
        Member member1 = memberService.memberLogin(member);
        if(member1==null){
            model.put("message","登录失败");
            //System.out.println("登录失败");
            return "/member/index";
        }else{
            session.setAttribute("member",member1);
            System.out.println("登录成功");
            //model.put("message","登录成功");
            LinkedList<Member> members = (LinkedList<Member>)session.getServletContext().getAttribute("members");
            if(members == null){
                members = new LinkedList<Member>();
            }
            members.add(member);
            session.getServletContext().setAttribute("members",members);
            return "/member/index";
        }
    }

    //退出登录
    @RequestMapping("/memberLoginOut")
    public String memberLoginOut(HttpSession session){
        logger.info(session.getAttribute("member")+":退出登录");
        session.removeAttribute("member");
        if(session.getAttribute("member") == null){
            System.out.println("session中的内容清空");
        }
        return "/member/index";
    }


}
