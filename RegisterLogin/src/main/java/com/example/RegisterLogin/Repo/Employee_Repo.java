package com.example.RegisterLogin.Repo;


import com.example.RegisterLogin.Entity.Employee;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public class Employee_Repo extends jpaRepository<Employee,Integer> {
}
