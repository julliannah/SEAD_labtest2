package com.example.s3687637_labtest2.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "Job")
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long job_id;

    private String title;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer_id;

    @ManyToOne
    @JoinColumn(name="admin_id")
    private Admin admin_id;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employer employee_id;

    public Job() {}

    public Job(String title, Category category, Employer employer_id, Admin admin_id, Employer employee_id) {
        this.title = title;
        this.category = category;
        this.employer_id = employer_id;
        this.admin_id = admin_id;
        this.employee_id = employee_id;
    }

    public Long getJob_id() {
        return job_id;
    }

    public void setJob_id(Long job_id) {
        this.job_id = job_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Employer getEmployer_id() {
        return employer_id;
    }

    public void setEmployer_id(Employer employer_id) {
        this.employer_id = employer_id;
    }

    public Admin getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Admin admin_id) {
        this.admin_id = admin_id;
    }

    public Employer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employer employee_id) {
        this.employee_id = employee_id;
    }
}
