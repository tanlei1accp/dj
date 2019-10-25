package com.example.csdj.member.mapper;

import com.example.csdj.branch.entity.Member;
import org.apache.ibatis.annotations.Param;


public interface MemberMapper{
   Member memberLogin(@Param("member") Member member);
}
