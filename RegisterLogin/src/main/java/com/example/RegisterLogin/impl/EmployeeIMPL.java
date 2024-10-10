package com.example.RegisterLogin.impl;

import com.example.RegisterLogin.Dto.Employee_DTO;
import com.example.RegisterLogin.Entity.Employee;
import com.example.RegisterLogin.Repo.Employee_Repo;
import com.example.RegisterLogin.Service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeIMPL  implements Employee_Service {
    @Autowired
    private Employee_Repo employeeRepo;

    @Autowired
    private passwordEncoder passwordEncoder;


    public String addEmployee(Employee_DTO employeeDTO) {
        Employee employee = new Employee(
                employeeDTO.getEmployee_id(),
                employeeDTO.getEmployee_name(),
                employeeDTO.getEmail());

        this.passwordEncoder.encode(employeeDTO.getPassword());

        employeeRepo.save(employee);
        return employee.getEmployee_name();
    }
}


