package com.example.csdj.member.service.impl;

import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends BaseServiceImpl implements MemberService {
    @Override
    public void addPartyMember() {
        logger.info("添加了一个党员");
    }
}
