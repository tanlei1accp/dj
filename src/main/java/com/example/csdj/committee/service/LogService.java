package com.example.csdj.committee.service;

import com.example.csdj.committee.entity.Operation;

import java.util.List;

public interface LogService {

    boolean insertlog(Operation operation);

    List<Operation> selectAll();
}
