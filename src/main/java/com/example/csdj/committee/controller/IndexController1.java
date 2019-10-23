package com.example.csdj.committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("committee")
@Controller
public class IndexController1 {
    @RequestMapping("/index")
    public String showIndex(){
        return "committee/index";
    }
}
