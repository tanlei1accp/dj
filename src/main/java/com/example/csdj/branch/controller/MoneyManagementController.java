package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 党费管理
 * */
@RequestMapping("/branch")
@Controller
public class MoneyManagementController extends BaseController {
    @RequestMapping("/MoneyManagement")
    public String MoneyManagement(){
        return "/branch/money/moneyList";
    }
    @RequestMapping("/moneyAfter")
    public String moneyAfter(){
        return "/branch/money/moneyAfter";
    }
}
