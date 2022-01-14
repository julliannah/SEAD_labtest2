package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Employee;
import com.example.s3687637_labtest2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(path = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(path = "/employees", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee){ employeeService.saveEmployee(employee); }

    @RequestMapping(path = "/employees", method = RequestMethod.PUT)
    public void updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
    }

    @RequestMapping(path = "/employees/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteEmployee(@PathVariable(value = "id") Long id){
        employeeService.deleteEmployee(id);
    }

    @RequestMapping(path = "/employees/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable(value = "id") Long id){
        return employeeService.getEmployee(id);
    }

}
