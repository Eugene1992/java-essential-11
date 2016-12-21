package com.cbs.edu.cw01;

import java.util.ArrayList;

public class Employee {

    int salary;
    String name;
    ArrayList<Employee> employees;

    public Employee(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    public Employee() {
    }
}
