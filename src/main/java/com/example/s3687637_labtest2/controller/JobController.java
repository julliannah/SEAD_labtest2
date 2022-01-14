package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Job;
import com.example.s3687637_labtest2.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class JobController {

    @Autowired
    private JobService jobService;

    @RequestMapping(path = "/jobs", method = RequestMethod.GET)
    public List<Job> getAllJobs(){
        return jobService.getAllJobs();
    }

    @RequestMapping(path = "/jobs", method = RequestMethod.POST)
    public void addJob(@RequestBody Job job){ jobService.saveJob(job); }

    @RequestMapping(path = "/jobs", method = RequestMethod.PUT)
    public void updateJob(@RequestBody Job job){
        jobService.saveJob(job);
    }

    @RequestMapping(path = "/jobs/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteJob(@PathVariable(value = "id") Long id){
        jobService.deleteJob(id);
    }

    @RequestMapping(path = "/jobs/{id}", method = RequestMethod.GET)
    public Job getJob(@PathVariable(value = "id") Long id){
        return jobService.getJob(id);
    }

}
