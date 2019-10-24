package com.example.csdj.member.controller;

import com.example.csdj.common.web.BaseController;
import com.example.csdj.member.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonalController extends BaseController {
    @Autowired
    PersonalService personalService;


}
