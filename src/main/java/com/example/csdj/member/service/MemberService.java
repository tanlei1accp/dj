package com.example.csdj.member.service;

import com.example.csdj.branch.entity.Member;

public interface MemberService {
    void addPartyMember();
    Member memberLogin(Member member);
}
