package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Admin;
import com.example.s3687637_labtest2.model.Employee;

import java.util.List;

public interface AdminService {
    public List<Admin> getAllAdmins();
    public void saveAdmin(Admin admin);
    public void deleteAdmin(Long id);
    public Admin getAdmin(Long id);
}
