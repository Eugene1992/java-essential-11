package com.cbs.edu.hw_02;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Department {
    private String tittle;
    private ArrayList<Employee> person;
    private int size = 0;

    public Department(String tittle){
        this.tittle = tittle;
        this.person = new ArrayList();
    }

    public  void addEmployee(Employee employee){
        person.add(employee);
    }

    public ArrayList<Employee> getPerson(){
        return  person;
    }

}
