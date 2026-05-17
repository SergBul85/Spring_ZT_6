package com.hstn.spring.rest.dao;

import com.hstn.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployees(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
