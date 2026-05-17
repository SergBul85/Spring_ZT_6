package com.hstn.spring.rest.controller;

import com.hstn.spring.rest.entity.Employee;
import com.hstn.spring.rest.exception_headling.NoSuchEmployeeException;
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
        Employee employee = employeeService.getEmployee(id);

        if (employee == null) {
            throw new NoSuchEmployeeException("No employee with id " + id);
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployees(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Employee upodateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployees(employee);
        return employee;
    }
}
