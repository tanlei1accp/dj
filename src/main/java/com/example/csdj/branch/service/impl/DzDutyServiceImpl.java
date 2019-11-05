package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.Duty;
import com.example.csdj.branch.mapper.DzDutyMapper;
import com.example.csdj.branch.service.DzDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DzDutyServiceImpl implements DzDutyService {
    @Autowired
    DzDutyMapper dzDutyMapper;
    @Override
    public List<Duty> selectDutyAll() {
        return dzDutyMapper.selectDutyAll();
    }
}
