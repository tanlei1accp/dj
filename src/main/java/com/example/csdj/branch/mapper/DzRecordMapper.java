package com.example.csdj.branch.mapper;

import com.example.csdj.branch.entity.Record;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DzRecordMapper {
    List<Record> selectRecordByMemId(@Param("memId")int memId);
    void addRecord(Record record);
}
