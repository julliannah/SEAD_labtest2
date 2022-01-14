package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Employer;

import java.util.List;

public interface EmployerService {
    public List<Employer> getAllEmployers();
    public void saveEmployer(Employer employer);
    public void deleteEmployer(Long id);
    public Employer getEmployer(Long id);
}
