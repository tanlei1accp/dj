package com.example.csdj.committee.mapper;

import com.example.csdj.committee.entity.Operation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
public interface LogMapper {
    int insertlog(Operation operation);
    List<Operation> selectAll();
}
