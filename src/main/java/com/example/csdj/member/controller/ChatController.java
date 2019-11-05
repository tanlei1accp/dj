package com.example.csdj.member.controller;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.entity.Chat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

@RestController
public class ChatController extends BaseController {
    /**
     *初始化聊天信息
     * @param session
     * @return
     */
    @PostMapping("/initChat")
    public String initChat(HttpSession session){
        //根据session对象得到ServletContext对象
        ServletContext application = session.getServletContext();
        //根据ServletContext对象的getAttribute方法得到用户列表
        //如果能够再次得到已经登录的用户列表，那么再此之前的某个地方已经向这个列表中存过值
        List<Member> members = (List<Member>)application.getAttribute("members");
        //取出当前用户
        Member member = (Member)session.getAttribute("member");
        //期初聊天信息
        Chat chat = (Chat)application.getAttribute("chat");
        //如果第一个用户第一次进来第一次聊天，chat是空，需要创建有个对象
        if(chat == null){
            chat = new Chat();
        }
        //将当前用户存入chat
        chat.setMember(member);
        //将当前登录的用户列表存入chat
        chat.setMembers(members);
        //将chat存入ServletContext对象
        application.setAttribute("chat",chat);
        //生成json
        String json = dealQueryResult(chat,chat);
        //返回json
        return json;
    }

    /**
     * 发送聊天信息
     * @param session
     * @param msg 聊天信息
     * @teturn
     */
    @PostMapping("/sendChat")
    public String sendChat(HttpSession session, String msg){
        //得到ServletContext对象
        ServletContext application = session.getServletContext();
        //从ServletContexte对象中取出聊天对象
        Chat chat = (Chat)application.getAttribute("chat");
        //从聊天对象中取出聊天列表
        LinkedList<String> chats = chat.getChats();
        //从session当中取出当前用户
        Member member = (Member)session.getAttribute("member");
        //向聊天对象当中添加聊天信息
        chats.addLast(member.getMemName()+" 说："+msg);
        //生成json
        String json = dealQueryResult(chat,chat);
        //返回json
        return json;
    }
}
