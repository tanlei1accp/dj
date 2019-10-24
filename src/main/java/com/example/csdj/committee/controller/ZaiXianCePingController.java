package com.example.csdj.committee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/testonline")
@Controller
public class ZaiXianCePingController {
    @RequestMapping("tiku")
    public String tiku(){
        return "committee/zaixianceping/question";
    }
    @RequestMapping("exam")
    public String exam(){
        return "committee/zaixianceping/exam";
    }
    @RequestMapping("ks")
    public String ks(){
        return "committee/zaixianceping/ks";
    }
    @RequestMapping("ceping")
    public String ceping(){
        return "committee/zaixianceping/ceping";
    }
}
