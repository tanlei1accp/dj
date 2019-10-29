package com.example.csdj.branch.mapper;

import com.example.csdj.branch.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DzMemberMapper {
    Member selectUserByNameAndPwd(@Param("member") Member member);

    Member selectUserByNameAndPwdforJg(@Param("member") Member member);

    List<Member> selectMemberAll();
    Member selectMemberById(@Param("memId")int memId);
    List<Member> selectMemberByDepaId(@Param("depaId")int depaId);
    void deleteMemberById(@Param("memId")int memId);
    void updateMemberById(Member member);
    void addMember(Member member);
    int selectMemberMaxId();
}
