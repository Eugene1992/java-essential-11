package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Дмитрий on 25.12.2016.
 */
public class EmployeeService {

    public static List<Employee> getSalaryInterval(Department department, int min, int max) {

        List<Employee> employees = new ArrayList();
        for (Employee person : department.getPerson()) {
            if (person.getSalary() <= max && person.getSalary() >= min) {
                employees.add(person);
            }
        }
        return employees;
    }

    public static List<Employee> getAgeinterval(Department department, int min, int max) {

        List<Employee> employees = new ArrayList();
        for (Employee person : department.getPerson()) {
            if (person.getAge() <= max && person.getAge() >= min) {
                employees.add(person);
            }
        }
        return employees;
    }

    public static List<Employee> addBonus(Department department, double bonus) {

        List<Employee> employees = new ArrayList();
        for (Employee person : department.getPerson()) {
            double salary = person.getSalary() + bonus * person.getSalary();
            person.setSalary((int)salary);
            employees.add(person);
        }
        return employees;
    }
}
