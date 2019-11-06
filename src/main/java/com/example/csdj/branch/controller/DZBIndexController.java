package com.example.csdj.branch.controller;
import com.example.csdj.branch.entity.Member;
import com.example.csdj.branch.service.DzMemberService;
import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
@RequestMapping("/branch")
@Controller
public class DZBIndexController {
    @Autowired
    DzMemberService dzMemberService;
    @SysLog("党员端首页")
    @RequestMapping("/index")
    public String index() {
        return "/branch/index";
    }
    @SysLog("登录")
   @RequestMapping("/login")
    public String login(){

       System.out.println("登陆");
        return "/branch/login";
    }
    @SysLog("登录到系统")
    @RequestMapping("doLogin")
    public String doLogin(String select, Model model, String u_name, String u_pwd, HttpSession session){
        System.out.println("值"+select);
        Member member=new Member();
        member.setMemName(u_name);
        member.setMemPwd(u_pwd);
        //获取subject
        //封装用户数据到token，token表示令牌
            System.out.println(member+"党支部传值");
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(member.getMemName(),member.getMemPwd(),select);
            try {
                if(subject.isAuthenticated()) {
                }
                subject.login(token);
            }catch (UnknownAccountException ex) {
                //该异常表示用户名不存在
                model.addAttribute("msg","用户名不存在");
                System.out.println("该异常表示用户名不存在");
                return "/branch/login";
            }catch(IncorrectCredentialsException ex) {
                //表示密码错误
                model.addAttribute("msg","密码错误");
                System.out.println("表示密码错误");
                return "/branch/login";
            } catch (AuthenticationException ex) {
                //表示认证失败
                model.addAttribute("msg","用户名或密码错误");
                System.out.println("表示认证失败");
                return "/branch/login";
            }
        if(select.equals("1")){
            session.setAttribute("session",member);
            System.out.println("到党支部");
            model.addAttribute("model",token);
            return "/branch/index";
        }else{
            session.setAttribute("session",member);
            System.out.println("到机关党委返回");
            return "/committee/index";
        }
    }
    @SysLog("退出")
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) {
            subject.logout();
        }
        return "/branch/login";
    }
}
