package com.example.demo_department.models.services.impl;

import com.example.demo_department.models.dto.req.DepartmentDTO;
import com.example.demo_department.models.entities.Department;
import com.example.demo_department.models.repositories.DepartmentRepository;
import com.example.demo_department.models.services.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(DepartmentDTO req){

        Department department = Department.builder()
                .name(req.name())
                .description(req.description())
                .build();
        return departmentRepository.save(department);
    }


}
