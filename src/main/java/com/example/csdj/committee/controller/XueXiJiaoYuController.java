package com.example.csdj.committee.controller;

import com.example.csdj.committee.entity.DocumentLearn;
import com.example.csdj.committee.entity.MeritorDeed;
import com.example.csdj.committee.entity.PioneerColumn;
import com.example.csdj.committee.service.XFZLService;
import com.example.csdj.committee.service.XJSJService;
import com.example.csdj.committee.service.XXJYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/xxjy")
public class XueXiJiaoYuController {
 //tb_meritorious_deeds 先进事迹
    //tb_pioneer_column  先锋撞烂
    //tb_document_learning 文件学习

    @Autowired
    private XXJYService xxjyService;

    @Autowired
    private XJSJService xjsjService;

    @Autowired
    private XFZLService xfzlService;

    //文件学习
    @RequestMapping("/wjxx")
    public String findAll(Model model){
       List<DocumentLearn> list=xxjyService.findAll();
       model.addAttribute("list",list);
        return "committee/xuexijiaoliu/studyFile";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){

        return "committee/xuexijiaoliu/adddocu";
    }

    @RequestMapping("/add")
    public String add(DocumentLearn documentLearn){
        xxjyService.add(documentLearn);
        return "redirect:wjxx";
    }

    @RequestMapping("/findById")
    public String findById(int docuid,Model model){
        DocumentLearn documentLearn= xxjyService.findById(docuid);
        model.addAttribute("docu",documentLearn);
        return "committee/xuexijiaoliu/editDocu";
    }
    @RequestMapping("/update")
    public String update(DocumentLearn documentLearn){
        xxjyService.update(documentLearn);

        return "redirect:wjxx";
    }

    @RequestMapping("/updateFabu")
    public String updateFabu(int docuid){
         xxjyService.updateFabu(docuid);
        return "redirect:wjxx";
    }

    @RequestMapping("/updateDel")
    public String updateDel(int docuid){
        xxjyService.updateDel(docuid);
        return "redirect:wjxx";
    }

    @RequestMapping("/updateDelRe")
    public String updateDelRe(int docuid){
        xxjyService.updateDelRe(docuid);
        return "redirect:wjxx";
    }

    @RequestMapping("/updateFbRe")
    public String updateFbRe(int docuid){
       xxjyService.updateFbRe(docuid);
        return "redirect:wjxx";
    }

    //先进事迹
    @RequestMapping("/xjsj")
    public String xjsj(Model model){
      List<MeritorDeed> deedlist= xjsjService.findAll();

       model.addAttribute("deed",deedlist);
       for(MeritorDeed m:deedlist){
           System.out.println("6666666666666"+m);
       }
        return "committee/xuexijiaoliu/deedList";
    }

    @RequestMapping("/toDeedAdd")
    public String toDeedAdd(){

        return "committee/xuexijiaoliu/deedAdd";
    }

    @RequestMapping("/deedAdd")
    public String deedAdd(MeritorDeed meritorDeed){
        xjsjService.add(meritorDeed);
        return "redirect:xjsj";
    }

    @RequestMapping("/deedUpdate")
    public String deedUpdate(MeritorDeed meritorDeed){
       xjsjService.update(meritorDeed);
        return "redirect:xjsj";
    }

    @RequestMapping("/findByDeedId")
    public String findByDeedId(int deedid,Model model){
       MeritorDeed meritorDeed= xjsjService.findByDeedId(deedid);
       model.addAttribute("deed",meritorDeed);
        return "committee/xuexijiaoliu/editDeed";
    }

    @RequestMapping("/updateDeedDel")
    public String updateDeedDel(int deedid){
       xjsjService.updateDeedDel(deedid);
        return "redirect:xjsj";
    }
    @RequestMapping("/updateDeedDelRe")
    public String updateDeedDelRe(int deedid){
      xjsjService.updateDeedDelRe(deedid);
        return "redirect:xjsj";
    }
    @RequestMapping("/updateDeedFabu")
    public String updateDeedFabu(int deedid){
      xjsjService.updateDeedFabu(deedid);
        return "redirect:xjsj";
    }
    @RequestMapping("/updateDeedFbRe")
    public String updateDeedFbRe(int deedid){
       xjsjService.updateDeedFbRe(deedid);
        return "redirect:xjsj";
    }
    //先锋专栏
    @RequestMapping("/xfzl")
    public String findAllXf(Model model){

        List<PioneerColumn> list=xfzlService.findAll();

        model.addAttribute("pioneerList",list);
        return "committee/xuexijiaoliu/poinerList";
    }

    @RequestMapping("/toPioneerAdd")
    public String toPioneerAdd(){

        return "committee/xuexijiaoliu/poinerAdd";
    }

    @RequestMapping("/pioneerAdd")
    public String pioneerAdd(PioneerColumn pioneerColumn){
        xfzlService.save(pioneerColumn);
        return "redirect:xfzl";
    }

    @RequestMapping("/findByPionId")
    public String findByPionId(int pioneerid,Model model){
        PioneerColumn pioneerColumn=xfzlService.findByPionId(pioneerid);
        model.addAttribute("pioneer",pioneerColumn);
        return "committee/xuexijiaoliu/poinerEdit";
    }

    @RequestMapping("/pioneerUpdate")
    public String pioneerUpdate(PioneerColumn pioneerColumn){
        xfzlService.pioneerUpdate(pioneerColumn);
        return "redirect:xfzl";
    }

    @RequestMapping("/updatePionDel")
    public String updatePionDel(int pioneerid){
        xfzlService.updatePionDel(pioneerid);
        return "redirect:xfzl";
    }

    @RequestMapping ("/updatePionDelRe")
    public String updatePionDelRe(int pioneerid){
        xfzlService.updatePionDelRe(pioneerid);
        return "redirect:xfzl";
    }

    @RequestMapping("/updatePionFabu")
    public String updatePionFabu(int pioneerid){
        xfzlService.updatePionFabu(pioneerid);
        return "redirect:xfzl";
    }

    @RequestMapping("/updatePionFbRe")
    public String updatePionFbRe(int pioneerid){
        xfzlService.updatePionFbRe(pioneerid);
        return "redirect:xfzl";
    }



}
