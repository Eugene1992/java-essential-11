package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class EmployeeService {


    public static List<Employee> getSalaryIntervalForEach(Department department, int from, int to) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp())
            if (emp.getSalary() > from && emp.getSalary() < to) {
                employees.add(emp);
            }
        return employees;
    }

    public static List<Employee> getAgeIntervalForEach(Department department, int from, int to) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp())
            if (emp.getAge() > from && emp.getAge() < to) {
                employees.add(emp);
            }
        return employees;
    }

    public static List<Employee> addBonus(Department department, int bonus) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp()) {
            emp.setSalary(emp.getSalary() + bonus);
            employees.add(emp);
        }
        return employees;
    }
}

    /*public static List<Employee> getSalaryIntervalJava8(Department department, final int from, final int to) {
        return department
                .getEmp()
                .stream()
                .filter(e -> e.getSalary() > from && e.getSalary() < to)
                .collect(Collectors.toList());
    }*/


