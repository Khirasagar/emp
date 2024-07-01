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
    public void addEmployee(EmployeeDto dto) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setName(dto.getName());
        entity.setEmailId(dto.getEmailId());
        employeeRepository.save(entity);

    }
}
