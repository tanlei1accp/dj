package com.example.csdj.branch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/branch")
public class Test {
    @RequestMapping("/index")
    public String index(){

        return "/branch/index";
    }

}
