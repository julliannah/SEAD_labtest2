package com.example.s3687637_labtest2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Employee")
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    private String employee_name;
    private int age;
    private String location;
    private String phone_num;
    private String job_field;
    private String qualification;
    private String years_of_experience;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employee_type_id")
    private Company company_id;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category_id;

    @OneToMany(mappedBy="employee_id")
    @JsonIgnore
    private Set<Job> jobs;

    public Employee() {}

    public Employee(String employee_name,
                    int age,
                    String location,
                    String phone_num,
                    String job_field,
                    String qualification,
                    String years_of_experience,
                    Company company_id,
                    Category category_id,
                    Set<Job> jobs) {
        this.employee_name = employee_name;
        this.age = age;
        this.location = location;
        this.phone_num = phone_num;
        this.job_field = job_field;
        this.qualification = qualification;
        this.years_of_experience = years_of_experience;
        this.company_id = company_id;
        this.category_id = category_id;
        this.jobs = jobs;
    }

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
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

    public String getJob_field() {
        return job_field;
    }

    public void setJob_field(String job_field) {
        this.job_field = job_field;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(String years_of_experience) {
        this.years_of_experience = years_of_experience;
    }

    public Company getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Company company_id) {
        this.company_id = company_id;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public Set<Job> getJobs() {
        return jobs;
    }

    public void setJobs(Set<Job> jobs) {
        this.jobs = jobs;
    }
}
