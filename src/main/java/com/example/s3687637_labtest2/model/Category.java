package com.example.s3687637_labtest2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Category")
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    private String position_level;
    private String experience_required;
    private String location;
    private String salary;
    private String job_description;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company_id;

    @OneToOne(mappedBy = "category")
    private Job job;

    public Category() {}

    public Category(String position_level,
                    String experience_required,
                    String location,
                    String salary,
                    String job_description,
                    Company company_id,
                    Job job) {
        this.position_level = position_level;
        this.experience_required = experience_required;
        this.location = location;
        this.salary = salary;
        this.job_description = job_description;
        this.company_id = company_id;
        this.job = job;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getPosition_level() {
        return position_level;
    }

    public void setPosition_level(String position_level) {
        this.position_level = position_level;
    }

    public String getExperience_required() {
        return experience_required;
    }

    public void setExperience_required(String experience_required) {
        this.experience_required = experience_required;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    public Company getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
