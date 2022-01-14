package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Company;
import com.example.s3687637_labtest2.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(path = "/companies", method = RequestMethod.GET)
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @RequestMapping(path = "/companies", method = RequestMethod.POST)
    public void addCompany(@RequestBody Company company){ companyService.saveCompany(company); }

    @RequestMapping(path = "/companies", method = RequestMethod.PUT)
    public void updateCompany(@RequestBody Company company){
        companyService.saveCompany(company);
    }

    @RequestMapping(path = "/companies/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteCompany(@PathVariable(value = "id") Long id){ companyService.deleteCompany(id); }

    @RequestMapping(path = "/companies/{id}", method = RequestMethod.GET)
    public Company getCompany(@PathVariable(value = "id") Long id){
        return companyService.getCompany(id);
    }
}
