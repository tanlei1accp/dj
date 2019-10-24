package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.mapper.PersonalMapper;
import com.example.csdj.member.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalServiceImpl extends BaseServiceImpl implements PersonalService {
    @Autowired
     PersonalMapper personalMapper;
}
