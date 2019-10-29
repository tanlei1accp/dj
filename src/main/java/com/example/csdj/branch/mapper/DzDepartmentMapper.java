package com.example.csdj.branch.mapper;

import com.example.csdj.branch.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DzDepartmentMapper {
    void addDepartment(Department department);
    List<Department> selectDepartmentAll();
    void updateDepartmentById(Department department);
    void deleteDepartmentById(@Param("depaId") int depaId);

}
