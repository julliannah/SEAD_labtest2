package com.example.s3687637_labtest2.service;
import com.example.s3687637_labtest2.model.Admin;
import com.example.s3687637_labtest2.model.Employee;
import com.example.s3687637_labtest2.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class AdminServiceImplementation implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public void saveAdmin(Admin admin){
        this.adminRepository.save(admin);
    }

    public List<Admin> getAllAdmins(){
        return this.adminRepository.findAll();
    }

    public Admin getAdmin(Long id){
        Admin admin = null;
        try {
            admin = this.adminRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found for this id :: " + id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }
    public void deleteAdmin(Long id){
        this.adminRepository.deleteById(id);
    }
}
