package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/branch")
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String index() {
        return "branch/index";
    }


}
