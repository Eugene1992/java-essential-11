package com.cbs.edu.hw_02;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Department {

    private String tittle;
    private ArrayList<Employee> employees;

    public Department(String tittle){
        this.tittle = tittle;
        this.employees = new ArrayList<>();
    }

    public  void addEmployee(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> getEmployees(){
        return employees;
    }
}
