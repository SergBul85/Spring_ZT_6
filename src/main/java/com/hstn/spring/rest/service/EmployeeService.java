package com.hstn.spring.rest.service;

import com.hstn.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployees(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
