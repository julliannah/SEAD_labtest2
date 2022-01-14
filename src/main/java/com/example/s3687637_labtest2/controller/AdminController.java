package com.example.s3687637_labtest2.controller;
import com.example.s3687637_labtest2.model.Admin;
import com.example.s3687637_labtest2.model.Employee;
import com.example.s3687637_labtest2.service.AdminService;
import com.example.s3687637_labtest2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(path = "/admins", method = RequestMethod.GET)
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }

    @RequestMapping(path = "/admins", method = RequestMethod.POST)
    public void addAdmin(@RequestBody Admin admin){ adminService.saveAdmin(admin); }

    @RequestMapping(path = "/admins", method = RequestMethod.PUT)
    public void updateAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
    }

    @RequestMapping(path = "/admins/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteAdmin(@PathVariable(value = "id") Long id){
        adminService.deleteAdmin(id);
    }

    @RequestMapping(path = "/admins/{id}", method = RequestMethod.GET)
    public Admin getAdmin(@PathVariable(value = "id") Long id){
        return adminService.getAdmin(id);
    }

}
