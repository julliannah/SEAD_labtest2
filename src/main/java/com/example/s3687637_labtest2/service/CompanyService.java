package com.example.s3687637_labtest2.service;

import com.example.s3687637_labtest2.model.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> getAllCompanies();
    public void saveCompany(Company company);
    public void deleteCompany(Long id);
    public Company getCompany(Long id);
}
