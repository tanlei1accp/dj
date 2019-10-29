package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.Record;
import com.example.csdj.branch.mapper.DzRecordMapper;
import com.example.csdj.branch.service.DzRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DzRecordServiceImpl implements DzRecordService {
    @Autowired
    DzRecordMapper dzRecordMapper;
    @Override
    public List<Record> selectRecordByMemId(int memId) {
        return dzRecordMapper.selectRecordByMemId(memId);
    }

    @Override
    public void addRecord(Record record) {
        dzRecordMapper.addRecord(record);
    }
}
