package com.example.csdj.branch.controller;

import com.alibaba.fastjson.JSON;
import com.example.csdj.branch.entity.*;
import com.example.csdj.branch.mapper.DzDepartmentMapper;
import com.example.csdj.branch.mapper.DzRecordMapper;
import com.example.csdj.branch.service.*;
import com.example.csdj.committee.annotation.SysLog;
import com.example.csdj.common.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 党员管理
 */
@RequestMapping("/branch")
@Controller
public class PartyMemberController extends BaseController {
    /**
     * 进入到党员管理页面
     * @return
     */
    @SysLog("进入党员管理主页")
    @RequestMapping("/partyMemberManage")
    public String partyMemberManage() {
        return "/branch/memberManagement/memberManage";
    }
    @SysLog("进入党员管理详情页")
    @RequestMapping("/memberDetails")
    public String memberDetails() {
        return "/branch/memberManagement/memberDetails";
    }
    @SysLog("更新党员管理")
    @RequestMapping("/memberUpdate")
    public String memberUpdate() {
        return "/branch/memberManagement/memberUpdate";
    }
    @SysLog("审核党员管理")
    @RequestMapping("/audit")
    public String audit() {
        return "/branch/memberManagement/audit";
    }
    @SysLog("添加党员")
    @RequestMapping("/memberAdd")
    public String memberAdd() {
        return "/branch/memberManagement/memberAdd";
    }
    @Autowired
    DzDutyService dzDutyService;
    @Autowired
    DzDepartmentService dzDepartmentService;
    @Autowired
    DzRecordService dzRecordService;
    @Autowired
    DzMemberService dzMemberService;
    @Autowired
    DzFamilyService dzFamilyService;
    @SysLog("查看所有职务")
    @ResponseBody
    @RequestMapping("/selectDutyAll")
    public String selectDutyAll(){
       List<Duty> list=dzDutyService.selectDutyAll();
        System.out.println("到了");
        String json = JSON.toJSONString(list);
        return json;
    }
    @SysLog("查看所有部门")
    @ResponseBody
    @RequestMapping("/selectDepartmentAll")
    public String selectDepartmentAll(){
        List<Department> departmentList=dzDepartmentService.selectDepartmentAll();
        for (Department aa:departmentList){
            System.out.println(aa.getDepaName());
        }
        String json = JSON.toJSONString(departmentList);
        return json;
    }
    //添加党员
    @RequestMapping("/addMember")
    public String addMember(Member member, TbFamily family, Record record,String aa,String bb){
        System.out.println("进入添加党员的方法。。。");
        String img="branch/img/"+aa;
        String resume="branch/img/"+bb;
        member.setImg(img);
        member.setResume(resume);
        dzMemberService.addMember(member);

        int maxid=dzMemberService.selectMemberMaxId();
        Member member1=new Member();
        member1.setMemId(maxid);
        record.setMember(member1);
        family.setMember(member1);

        dzFamilyService.addFamily(family);
        dzRecordService.addRecord(record);
        return"redirect:selectMemberAll";
    }
    @RequestMapping("selectMemberAll")
    public String selectMemberAll(Model model ){
      List<Member> list=dzMemberService.selectMemberAll();
      model.addAttribute("list",list);
        return"committee/dwgl/list";
    }
    @RequestMapping("/selectMemberById")
    public String selectMemberById(int memId,Model model){
        Member member=dzMemberService.selectMemberById(memId);
        List<Record> record=dzRecordService.selectRecordByMemId(memId);
        List<TbFamily> family=dzFamilyService.selectFamilyByMemId(memId);
        for(Record  aa:record){
            System.out.println(aa.getReTime());
        }
        model.addAttribute("record",record);
        model.addAttribute("family",family);
        model.addAttribute("member",member);
        return"committee/dwgl/member";
    }
    @RequestMapping("/selectMemberByDepaId")
    public String selectMemberByDepaId(int depaId,Model model){
        List<Member> list=dzMemberService.selectMemberByDepaId(depaId);
        model.addAttribute("list",list);
        return"committee/dwgl/list";
    };
    @RequestMapping("/updateMemberById")
    public String updateMemberById(int memId,Model model){
        Member member=dzMemberService.selectMemberById(memId);
        List<Record> record=dzRecordService.selectRecordByMemId(memId);
        List<TbFamily> family=dzFamilyService.selectFamilyByMemId(memId);
        for(Record  aa:record){
            System.out.println(aa.getReTime());
        }
        model.addAttribute("record",record);
        model.addAttribute("family",family);
        model.addAttribute("member",member);
        return"committee/dwgl/update";
    }
    @RequestMapping("/updateMember")
    public String updateMemberById(Member member, TbFamily family, Record record){

        family.setMember(member);
        record.setMember(member);
        dzMemberService.updateMemberById(member);
        dzFamilyService.addFamily(family);
        dzRecordService.addRecord(record);
        return"redirect:selectMemberAll";
    }
}
