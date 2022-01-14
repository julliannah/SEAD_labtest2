package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Employee;
import com.example.s3687637_labtest2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class EmployeeServiceImplementation implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void saveEmployee(Employee employee){
        this.employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }

    public Employee getEmployee(Long id){
        Employee employee = null;
        try {
            employee = this.employeeRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
    public void deleteEmployee(Long id){
        this.employeeRepository.deleteById(id);
    }
}
