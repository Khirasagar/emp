package com.employee.controller;

import com.employee.dto.EmployeeDto;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeServiceImpl emp;

    public EmployeeController(EmployeeServiceImpl emp) {
        this.emp = emp;
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto dto){
        EmployeeDto employeeDto = emp.addEmployee(dto);
        return new ResponseEntity<>(employeeDto, HttpStatus.CREATED);
    }
}
