package com.example.s3687637_labtest2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Employer")
@Table(name = "employer")
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employer_id;

    private String employer_name;
    private int age;
    private String location;
    private String phone_num;

    @ManyToOne
    @JoinColumn(name="company_id")
    private Company company_id;

    @OneToMany(mappedBy="employer_id")
    @JsonIgnore
    private Set<Job> jobs;

    public Employer() {}

    public Employer(String employer_name,
                    int age,
                    String location,
                    String phone_num,
                    Company company_id,
                    Set<Job> jobs) {
        this.employer_name = employer_name;
        this.age = age;
        this.location = location;
        this.phone_num = phone_num;
        this.company_id = company_id;
        this.jobs = jobs;
    }

    public Long getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(Long employer_id) {
        this.employer_id = employer_id;
    }

    public String getEmployer_name() {
        return employer_name;
    }

    public void setEmployer_name(String employer_name) {
        this.employer_name = employer_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public Company getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }
}
