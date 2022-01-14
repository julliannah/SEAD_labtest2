package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Long id);
    public Employee getEmployee(Long id);
}
