package com.example.EmployeePayrollApplication.Repositories;

import com.example.EmployeePayrollApplication.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}