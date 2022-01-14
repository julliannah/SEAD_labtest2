package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Admin;
import com.example.s3687637_labtest2.model.Job;
import com.example.s3687637_labtest2.repository.AdminRepository;
import com.example.s3687637_labtest2.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class JobServiceImplementation implements JobService {

    @Autowired
    private JobRepository jobRepository;

    public void saveJob(Job job){
        this.jobRepository.save(job);
    }

    public List<Job> getAllJobs(){
        return this.jobRepository.findAll();
    }

    public Job getJob(Long id){
        Job job = null;
        try {
            job = this.jobRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return job;
    }
    public void deleteJob(Long id){
        this.jobRepository.deleteById(id);
    }
}
