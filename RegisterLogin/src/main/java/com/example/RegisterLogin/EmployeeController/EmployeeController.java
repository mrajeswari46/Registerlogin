package com.example.RegisterLogin.EmployeeController;


import com.example.RegisterLogin.Dto.Employee_DTO;
import com.example.RegisterLogin.Service.Employee_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")

public class EmployeeController {
    @Autowired
  private  Employee_Service employeeService;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody Employee_DTO employeeDTO)
    {
        String id= employeeService.addEmployee(employeeDTO);
        return id;
    }

}
