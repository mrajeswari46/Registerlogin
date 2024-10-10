package com.example.RegisterLogin.Dto;

public class Employee_DTO {

private int employee_id;
   private String employee_name;
   private String email;
    private String password;

    public Employee_DTO(int employee_id, String employee_name, String email, String password) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.email = email;
        this.password = password;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee_DTO{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Employee_DTO(){

     }
}