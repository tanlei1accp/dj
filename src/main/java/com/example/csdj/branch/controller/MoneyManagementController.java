package com.example.csdj.branch.controller;

import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
 * 党费管理
 * */
@RequestMapping("/branch")
@Controller
public class MoneyManagementController extends BaseController {
    @SysLog("查看党费缴纳情况")
    @RequestMapping("/MoneyManagement")
    public String MoneyManagement(){
        return "/branch/money/moneyList";
    }
    @SysLog("查看已缴费")
    @RequestMapping("/moneyAfter")
    public String moneyAfter(){
        return "/branch/money/moneyAfter";
    }
}
