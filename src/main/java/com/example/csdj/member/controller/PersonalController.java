package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class PersonalController extends BaseController {
    @Autowired
    PersonalService personalService;
@RequestMapping("mainindex")
    public String mainindex(){
    return "index";
}
    @RequestMapping("note")
    public String note(){
        return "meber/";
    }
    @RequestMapping("experience")
    public String experience(){
        return "index";
    }
    @RequestMapping("suggest")
    public String suggest(){
        return "index";
    }



}
