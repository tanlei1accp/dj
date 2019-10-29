package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.Member;
import com.example.csdj.branch.mapper.DzMemberMapper;
import com.example.csdj.branch.service.DzMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Member selectUserByNameAndPwdforJg(Member member) {
        System.out.println("member"+member.getMemName());
        return dzMemberMapper.selectUserByNameAndPwdforJg(member);
    }

    @Override
    public List<Member> selectMemberAll() {
        return dzMemberMapper.selectMemberAll();
    }

    @Override
    public Member selectMemberById(int memId) {
        return dzMemberMapper.selectMemberById(memId);
    }

    @Override
    public List<Member> selectMemberByDepaId(int depaId) {
        return dzMemberMapper.selectMemberByDepaId(depaId);
    }

    @Override
    public void deleteMemberById(int memId) {
        dzMemberMapper.deleteMemberById(memId);
    }

    @Override
    public void updateMemberById(Member member) {
        dzMemberMapper.updateMemberById(member);
    }

    @Override
    public void addMember(Member member) {
        dzMemberMapper.addMember(member);
    }

    @Override
    public int selectMemberMaxId() {
        return dzMemberMapper.selectMemberMaxId();
    }

}
