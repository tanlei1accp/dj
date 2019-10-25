package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.branch.mapper.DzMemberMapper;
import com.example.csdj.branch.service.DzMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class DzMemberServiceImpl implements DzMemberService {
    @Autowired
    DzMemberMapper dzMemberMapper;
    @Override
    public Member selectUserByNameAndPwd(Member member) {
        System.out.println("member"+member.getMemName());
        return dzMemberMapper.selectUserByNameAndPwd(member);
    }

    @Override
    public Member selectUserByNameAndPwdforJg(Member member) {
        System.out.println("member"+member.getMemName());
        return dzMemberMapper.selectUserByNameAndPwdforJg(member);
    }
}
