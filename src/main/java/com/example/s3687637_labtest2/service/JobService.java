package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Admin;
import com.example.s3687637_labtest2.model.Job;

import java.util.List;

public interface JobService {
    public List<Job> getAllJobs();
    public void saveJob(Job job);
    public void deleteJob(Long id);
    public Job getJob(Long id);
}
