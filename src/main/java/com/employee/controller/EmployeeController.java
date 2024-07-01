package com.employee.controller;

import com.employee.dto.EmployeeDto;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeServiceImpl emp;

    public EmployeeController(EmployeeServiceImpl emp) {
        this.emp = emp;
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody EmployeeDto dto){
        emp.addEmployee(dto);
        return "done";
    }
}
