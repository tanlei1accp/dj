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
    public Member selectUserByNameAndPwd(String name,String select) {
//        System.out.println("member"+member.getMemName());
        if(select.equals("1")){
            System.out.println("党支部");
            return dzMemberMapper.selectUserByNameAndPwd(name);
        }
        System.out.println("机关党委");
        return dzMemberMapper.selectUserByNameAndPwdforJg(name);
    }


}
