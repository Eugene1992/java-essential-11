package com.cbs.edu.hw_02;

import java.util.ArrayList;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Department {

    private String title;
    private ArrayList<Employee> emp;
    public static int size = 0;

    public Department(String title) {
        this.title = title;
        this.emp = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        emp.add(employee);
        size++;
    }

    public ArrayList<Employee> getEmp() {
        return emp;
    }


}
