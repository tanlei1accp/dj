package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.entity.Notice;
import com.example.csdj.member.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NoticeController extends BaseController{
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("findAllNotice")
    public String findAll(Model model){
        List<Notice> notice=noticeService.findAll();
        model.addAttribute("noticeAll",notice);
        return "";
    }

    @RequestMapping("addNotice")
    public String addNotice(Notice notice){
      return "";
    }

    @RequestMapping("findById")
    public String findById(int id){
        return "";
    }

    @RequestMapping("delById")
    public String delById(Notice notice){
        return "";
    }

    @RequestMapping("updById")
    public String updById(Notice notice){
        return "";
    }
}
