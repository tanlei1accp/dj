package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.TbFamily;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DzFamilyService {
    List<TbFamily> selectFamilyByMemId(@Param("memId") int memId);
    void addFamily(TbFamily family);
    void updateFamilyById(@Param("famId")int famId);
}
