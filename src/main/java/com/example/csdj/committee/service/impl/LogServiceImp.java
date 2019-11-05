package com.example.csdj.committee.service.impl;

import com.example.csdj.committee.mapper.LogMapper;
import com.example.csdj.committee.entity.Operation;
import com.example.csdj.committee.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class LogServiceImp implements LogService {
    @Autowired
    private LogMapper logMapper;
    @Override
    public boolean insertlog(Operation operation) {
        return logMapper.insertlog(operation)>0?true:false;
    }

    @Override
    public List<Operation> selectAll() {
        return logMapper.selectAll();
    }
}
