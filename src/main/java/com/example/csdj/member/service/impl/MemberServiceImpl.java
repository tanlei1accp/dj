package com.example.csdj.member.service.impl;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.common.service.impl.BaseServiceImpl;
import com.example.csdj.member.mapper.MemberMapper;
import com.example.csdj.member.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends BaseServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public void addPartyMember() {
        logger.info("添加了一个党员");
    }

    @Override
    public Member memberLogin(Member member) {

        return memberMapper.memberLogin(member);
    }
}
