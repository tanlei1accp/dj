package com.example.csdj.branch.mapper;

import com.example.csdj.branch.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface DzMemberMapper {
    Member selectUserByNameAndPwd(String name);

    Member selectUserByNameAndPwdforJg(String name);
}
