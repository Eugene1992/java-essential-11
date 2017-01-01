package com.cbs.edu.hw_01;

import java.util.ArrayList;

/**
 * Class for realize business logic, include only one method getAverage().
 * @author Sviatoslav
 * @version 1.0
 */
public class EmployeeService {
    /**
     *
     * @param employees - collection for storing all our employees
     * @return average salary our employee;
     */
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
