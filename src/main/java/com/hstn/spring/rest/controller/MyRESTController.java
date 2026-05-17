package com.hstn.spring.rest.controller;

import com.hstn.spring.rest.entity.Employee;
import com.hstn.spring.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") int id) {
        return employeeService.getEmployee(id);
    }

}
