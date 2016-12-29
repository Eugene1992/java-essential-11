package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public final class EmployeeService {

    private EmployeeService() {
    }

    public static List<Employee> getSalaryInterval(Department department, int min, int max) {
        List<Employee> employees = new ArrayList<>();
        if(min < 0 || max < min || max < 0) throw new IllegalArgumentException("Value of 'min' is negative or 'max' > 'min'");
        for (Employee person : department.getEmployees()) {
            if (person.getSalary() <= max && min <= person.getSalary()) {
                employees.add(person);
            }
        }
        return employees;
    }

    public static List<Employee> getAgeinterval(Department department, int min, int max) {

        List<Employee> employees = new ArrayList<>();
        for (Employee person : department.getEmployees()) {
            if (person.getAge() <= max && person.getAge() >= min) {
                employees.add(person);
            }
        }
        return employees;
    }

    public static List<Employee> addBonus(Department department, double bonus) throws MyException{

        List<Employee> employees = new ArrayList<>();
        try {
            bonus = 0;
        } catch (IllegalArgumentException e) {
             throw new MyException("Bonus can not be 0");
        }
        for (Employee person : department.getEmployees()) {
            double salary = person.getSalary() + bonus * person.getSalary();
            person.setSalary((int)salary);
            employees.add(person);
        }
        return employees;
    }
}
