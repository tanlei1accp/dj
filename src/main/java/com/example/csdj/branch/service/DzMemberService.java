package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.Member;


import java.util.List;

public interface DzMemberService {
    Member selectUserByNameAndPwd(String name,String select);

   /* Member selectUserByNameAndPwdforJg(Member member);*/
    Member selectUserByNameAndPwdforJg(Member member);
    List<Member> selectMemberAll();
    Member selectMemberById(int memId);
    List<Member> selectMemberByDepaId(int depaId);
    void deleteMemberById(int memId);
    void updateMemberById(Member member);
    void addMember(Member member);
    int selectMemberMaxId();
}
