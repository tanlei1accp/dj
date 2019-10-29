package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.Member;

public interface DzMemberService {
    Member selectUserByNameAndPwd(String name,String select);

   /* Member selectUserByNameAndPwdforJg(Member member);*/
}
