package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.TbFamily;
import com.example.csdj.branch.mapper.DzFamilyMapper;
import com.example.csdj.branch.service.DzFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DzFamilyServiceImpl implements DzFamilyService {
    @Autowired
    DzFamilyMapper dzFamilyMapper;
    @Override
    public List<TbFamily> selectFamilyByMemId(int memId) {
        return dzFamilyMapper.selectFamilyByMemId(memId);
    }

    @Override
    public void addFamily(TbFamily family) {
        dzFamilyMapper.addFamily(family);
    }

    @Override
    public void updateFamilyById(int famId) {
        dzFamilyMapper.updateFamilyById(famId);
    }
}
