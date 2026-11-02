package com.example.demo_department.models.services;

import com.example.demo_department.models.dto.req.DepartmentDTO;
import com.example.demo_department.models.entities.Department;

public interface DepartmentService {

    Department createDepartment(DepartmentDTO req);
}
