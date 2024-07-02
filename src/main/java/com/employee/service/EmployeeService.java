package com.employee.service;

import com.employee.dto.EmployeeDto;

public interface EmployeeService {
    public EmployeeDto addEmployee(EmployeeDto dto);
    void deleteEmployee(long employeeId);
}
