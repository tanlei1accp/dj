package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.Member;

public interface DzMemberService {
    Member selectUserByNameAndPwd(Member member);

    Member selectUserByNameAndPwdforJg(Member member);
}
