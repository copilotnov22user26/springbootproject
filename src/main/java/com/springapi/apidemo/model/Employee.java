package com.springapi.apidemo.model;

import lombok.Data;

@Data
// class employee with properties id, name,city and salary
public class Employee {
    private int id;
    private String name;
    private String city;
    private double salary;

    public Employee(int id, String name, String city, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
}
