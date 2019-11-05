package com.example.csdj.member.controller;

import com.example.csdj.common.utils.RandomValidateCode;
import com.example.csdj.common.web.BaseController;


import com.example.csdj.branch.entity.Member;
import com.example.csdj.member.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import java.io.IOException;
import java.util.*;

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
    public String memberLogin(ModelMap model,HttpSession session,HttpServletRequest request, Member member){
        System.out.println("跳转成功");

        String validate = request.getParameter("validate");
        String code = (String) session.getAttribute("code");
        if(code.equalsIgnoreCase(validate) && code!=null){
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
        }else{
            model.put("message","验证码错误!");
            return "/member/index";
        }
    }

    //退出登录
    @RequestMapping("/memberLoginOut")
    public String memberLoginOut(HttpSession session){
        Member member = (Member)session.getAttribute("member");
        logger.info(member.getMemName()+":退出登录");
        session.removeAttribute("member");
        return "/member/index";
    }

    /**
     * 获取生成验证码显示到 UI 界面
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping(value="/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws ServletException, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
