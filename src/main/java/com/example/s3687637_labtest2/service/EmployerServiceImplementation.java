package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Employer;
import com.example.s3687637_labtest2.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class EmployerServiceImplementation implements EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

    public void saveEmployer(Employer employer){
        this.employerRepository.save(employer);
    }

    public List<Employer> getAllEmployers(){
        return this.employerRepository.findAll();
    }

    public Employer getEmployer(Long id){
        Employer employer = null;
        try {
            employer = this.employerRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employer;
    }
    public void deleteEmployer(Long id){
        this.employerRepository.deleteById(id);
    }
}
