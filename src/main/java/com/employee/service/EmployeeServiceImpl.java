package com.employee.service;

import com.employee.dto.EmployeeDto;
import com.employee.entity.EmployeeEntity;
import com.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public EmployeeDto addEmployee(EmployeeDto dto) {
        EmployeeEntity entity = new EmployeeEntity();

        entity.setName(dto.getName());
        entity.setEmailId(dto.getEmailId());
        //save to entity
        EmployeeEntity savedEmployee = employeeRepository.save(entity);

        EmployeeDto edto = new EmployeeDto();
        edto.setId(savedEmployee.getId());
        edto.setName(savedEmployee.getName());
        edto.setEmailId(savedEmployee.getEmailId());
        return edto;

    }
}
