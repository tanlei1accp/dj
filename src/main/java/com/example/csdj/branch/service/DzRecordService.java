package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.Record;

import java.util.List;

public interface DzRecordService {
    List<Record> selectRecordByMemId(int memId);
    void addRecord(Record record);

}
