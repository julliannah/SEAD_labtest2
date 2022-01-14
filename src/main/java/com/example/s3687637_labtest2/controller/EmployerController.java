package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Employer;
import com.example.s3687637_labtest2.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @RequestMapping(path = "/employers", method = RequestMethod.GET)
    public List<Employer> getAllEmployers(){
        return employerService.getAllEmployers();
    }

    @RequestMapping(path = "/employers", method = RequestMethod.POST)
    public void addEmployer(@RequestBody Employer employer){ employerService.saveEmployer(employer); }

    @RequestMapping(path = "/employers", method = RequestMethod.PUT)
    public void updateEmployer(@RequestBody Employer employer){
        employerService.saveEmployer(employer);
    }

    @RequestMapping(path = "/employers/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteEmployer(@PathVariable(value = "id") Long id){
        employerService.deleteEmployer(id);
    }

    @RequestMapping(path = "/employers/{id}", method = RequestMethod.GET)
    public Employer getEmployer(@PathVariable(value = "id") Long id){
        return employerService.getEmployer(id);
    }

}
