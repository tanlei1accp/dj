package com.example.csdj.branch.service;

import com.example.csdj.branch.entity.Department;


import java.util.List;

public interface DzDepartmentService {
    void addDepartment(Department department);
    List<Department> selectDepartmentAll();
    void updateDepartmentById(Department department);
    void deleteDepartmentById(int depaId);
}
