package com.example.csdj.branch.controller;

import com.example.csdj.common.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/*
*学习笔记
* */
@RequestMapping("/branch")
@Controller
public class StudyNotesController extends BaseController {
    @RequestMapping("studyNotes")
    public String studyNotes(){
        return "/branch/studyNotes/studyNotesIndex";
    }
    @RequestMapping("studyNotesDetail")
    public String studyNotesDetail(){
        return "/branch/studyNotes/studyNotesDetail";
    }
}
