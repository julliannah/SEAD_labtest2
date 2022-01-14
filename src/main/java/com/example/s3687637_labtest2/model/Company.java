package com.example.s3687637_labtest2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Company")
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;

    private String company_name;
    private String company_overview;
    private String industry_field;

    @OneToMany(mappedBy="company_id")
    @JsonIgnore
    private Set<Category> categories;

    @OneToMany(mappedBy="company_id")
    @JsonIgnore
    private Set<Employer> employers;

    public Company() {}

    public Company(String company_name,
                   String company_overview,
                   String industry_field,
                   Set<Category> categories,
                   Set<Employer> employers) {
        this.company_name = company_name;
        this.company_overview = company_overview;
        this.industry_field = industry_field;
        this.categories = categories;
        this.employers = employers;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_overview() {
        return company_overview;
    }

    public void setCompany_overview(String company_overview) {
        this.company_overview = company_overview;
    }

    public String getIndustry_field() {
        return industry_field;
    }

    public void setIndustry_field(String industry_field) {
        this.industry_field = industry_field;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public Set<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(Set<Employer> employers) {
        this.employers = employers;
    }
}
