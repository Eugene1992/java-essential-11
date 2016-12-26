package com.cbs.edu.hw_01;

import java.util.ArrayList;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class EmployeeService {
    public static double getAverage(ArrayList<Employee> employees){
        double sum = 0;
        double average;
        for (int i = 0; i < employees.size(); i++) {
            sum = sum + employees.get(i).getSalary();
        }
        average = sum/employees.size();
        return average;
    }
}
