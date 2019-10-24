package com.example.csdj.committee.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
    @Controller
    public class IndexController extends BaseController {

       
        @RequestMapping("/in")
        public String index() {

            return "committee/index.html";
        }
        //dwgk
        @RequestMapping("/add")
        public String add() {

            return "committee/dwgk/add";
        }
        @RequestMapping("/audit")
        public String audit() {

            return "committee/dwgk/audit";
        }
        @RequestMapping("/audit_member")
        public String audit_member() {

            return "committee/dwgk/audit_member";
        }
        @RequestMapping("/audit_over")
        public String audit_over() {

            return "committee/dwgk/audit_over";
        }
        @RequestMapping("/check")
        public String check() {

            return "committee/dwgk/check";
        }
        @RequestMapping("/departmentAdd")
        public String departmentadd() {

            return "committee/dwgk/department_add";
        }
        @RequestMapping("/departmentlist")
        public String departmentlist() {

            return "committee/dwgk/department_list";
        }
        @RequestMapping("/departmentUpdate")
        public String departmentupdate() {

            return "committee/dwgk/department_update";
        }
        @RequestMapping("/indexdwgk")
        public String department_add() {

            return "committee/dwgk/index";
        }
        @RequestMapping("/lifeCommittee")
        public String lifeCommittee() {

            return "committee/dwgk/life-committee";
        }
        @RequestMapping("/list")
        public String list() {

            return "committee/dwgk/list";
        }
        @RequestMapping("/login")
        public String login() {

            return "committee/dwgk/login";
        }
        @RequestMapping("/member")
        public String member() {

            return "committee/dwgk/member";
        }
        @RequestMapping("/moneyCommittee")
        public String moneyCommittee() {

            return "committee/dwgk/money-committee";
        }
        @RequestMapping("/update")
        public String update() {

            return "committee/dwgk/update";
        }
        //问卷管理
        @RequestMapping("/findSurvey")
        public String findSurvey() {

            return "committee/wenjuandiaocha/findSurvey";
        }
        @RequestMapping("/addQuestion")
        public String addQuestion() {

            return "committee/wenjuandiaocha/addQuestion";
        }
        @RequestMapping("/faBu")
        public String faBu() {

            return "committee/wenjuandiaocha/faBu";
        }
        @RequestMapping("/score")
        public String score() {

            return "committee/wenjuandiaocha/score";
        }
        @RequestMapping("/tongJi")
        public String tongJi() {

            return "committee/wenjuandiaocha/tongJi";
        }
        //在线测评
        @RequestMapping("/ceping")
        public String ceping() {

            return "committee/zaixianceping/ceping";
        }
        @RequestMapping("/exam")
        public String exam() {

            return "committee/zaixianceping/exam";
        }
        @RequestMapping("/ks")
        public String ks() {

            return "committee/zaixianceping/ks";
        }
        @RequestMapping("/question")
        public String question() {

            return "committee/zaixianceping/question";
        }
    }


