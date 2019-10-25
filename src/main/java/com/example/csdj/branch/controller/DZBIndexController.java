package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/branch")
@Controller
public class DZBIndexController extends BaseController {

    @RequestMapping("/index")
    public String index() {
        return "/branch/index";
    }
   @RequestMapping("/login")
    public String login(){
        return "/branch/login";
    }

}
