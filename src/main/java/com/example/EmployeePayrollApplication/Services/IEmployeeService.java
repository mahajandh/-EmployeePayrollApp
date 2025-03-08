package com.example.EmployeePayrollApplication.Services;

import com.example.EmployeePayrollApplication.Model.Employee;
import com.example.EmployeePayrollApplication.DTOs.EmployeeDTO;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(Long id);

    EmployeeDTO updateEmployee(Long id ,EmployeeDTO employeeDTO);

    void deleteEmployee(Long id);
}