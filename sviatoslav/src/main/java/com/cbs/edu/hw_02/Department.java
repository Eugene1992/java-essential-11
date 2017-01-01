package com.cbs.edu.hw_02;

import java.util.ArrayList;

/**
 * Class for create new department.
 * @author Sviatoslav
 * @version 2.0
 */
public class Department {

    private String title;
    private ArrayList<Employee> emp;
    public static int size = 0;

    /**
     * Constructor for creating new department
     * @param title - name of new department;
     */
    public Department(String title) {
        this.title = title;
        this.emp = new ArrayList<>();
    }

    /**
     * Method for adding new employee to department;
     * @param employee - employee who will adding to department.
     */
    public void addEmployee(Employee employee){
        emp.add(employee);
        size++;
    }

    public ArrayList<Employee> getEmp() {
        return emp;
    }


}
