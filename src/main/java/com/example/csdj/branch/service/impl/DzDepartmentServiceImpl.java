package com.example.csdj.branch.service.impl;

import com.example.csdj.branch.entity.Department;
import com.example.csdj.branch.mapper.DzDepartmentMapper;
import com.example.csdj.branch.service.DzDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DzDepartmentServiceImpl implements DzDepartmentService {
    @Autowired
    DzDepartmentMapper dzDepartmentMapper;
    @Override
    public void addDepartment(Department department) {
        dzDepartmentMapper.addDepartment(department);
    }

    @Override
    public List<Department> selectDepartmentAll() {
        return dzDepartmentMapper.selectDepartmentAll();
    }

    @Override
    public void updateDepartmentById(Department department) {
        dzDepartmentMapper.updateDepartmentById(department);
    }

    @Override
    public void deleteDepartmentById(int depaId) {
        dzDepartmentMapper.deleteDepartmentById(depaId);
    }
}
