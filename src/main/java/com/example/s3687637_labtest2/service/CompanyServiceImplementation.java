package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Company;
import com.example.s3687637_labtest2.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CompanyServiceImplementation implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public void saveCompany(Company company){
        this.companyRepository.save(company);
    }

    public List<Company> getAllCompanies(){
        return this.companyRepository.findAll();
    }

    public Company getCompany(Long id){
        Company company = null;
        try {
            company = this.companyRepository.findById(id)
                    .orElseThrow(() -> new Exception("Seller not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return company;
    }
    public void deleteCompany(Long id){
        this.companyRepository.deleteById(id);
    }
}
