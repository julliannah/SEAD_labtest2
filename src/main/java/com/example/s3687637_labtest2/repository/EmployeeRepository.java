package com.example.s3687637_labtest2.repository;
import com.example.s3687637_labtest2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
