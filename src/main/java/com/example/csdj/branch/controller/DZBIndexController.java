package com.example.csdj.branch.controller;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.branch.service.DzMemberService;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("/branch")
@Controller
public class DZBIndexController {
    @Autowired
    DzMemberService dzMemberService;
    @RequestMapping("/index")
    public String index() {
        return "/branch/index";
    }
   @RequestMapping("/login")
    public String login(){
        return "/branch/login";
    }
    @RequestMapping("doLogin")
    public String doLogin(Integer select, ModelMap model, String u_name, String u_pwd, HttpSession session){
        System.out.println("值"+select);
        Member member=new Member();
        member.setMemName(u_name);
        member.setMemPwd(u_pwd);
        if(select==1){
            System.out.println(member+"党支部传值");
            Member a=dzMemberService.selectUserByNameAndPwd(member);
            System.out.println("党支部登陆"+a);
            if (a != null) {
            session.setAttribute("member",a);
//                model.put("member",a);
                return "/branch/index";
            }else {
                model.put("msg","登录失败");
                System.out.println("登陆失败");
                return "redirect:login";
            }
        }
        if(select==2){
            Member b=dzMemberService.selectUserByNameAndPwdforJg(member);
            System.out.println("机关党委登陆"+b);
            if (b != null) {
                session.setAttribute("member",b);
//                model.put("member",b);
                return "/committee/index";
            }else {
                System.out.println("登陆失败");
                model.put("msg","登录失败");
                return "redirect:login";
            }
        }
        return "redirect:login";
    }
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) {
            subject.logout();
        }
        return "/branch/login";
    }

}
