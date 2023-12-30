package com.springapi.apidemo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.apidemo.model.Employee;
import com.springapi.apidemo.repository.employeerepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    employeerepository employeerepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        List<Employee> emp = List.of(new Employee(1, "Raj", "Mumbai", 10000), new Employee(2, "Rahul", "Delhi", 20000),
                new Employee(3, "Ramesh", "Chennai", 30000), new Employee(4, "Rajesh", "Kolkata", 40000));
        return emp;
    } 
}
