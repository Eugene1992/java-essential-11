package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sviatoslav
 * @version 2.0
 */
public class EmployeeService {

    /**
     *
     * @param department - department where we have employee;
     * @param from - beginning of salary interval(non-include)
     * @param to - the end of salary interval(non-include)
     * @return - employees, whose salary between "from" and "to";
     */
    public static List<Employee> getSalaryIntervalForEach(Department department, int from, int to) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp())
            if (emp.getSalary() > from && emp.getSalary() < to) {
                employees.add(emp);
            }
        return employees;
    }
    /**
     *
     * @param department - department where we have employee;
     * @param from - beginning of age interval(non-include)
     * @param to - the end of age interval(non-include)
     * @return - employees, whose age between "from" and "to";
     */
    public static List<Employee> getAgeIntervalForEach(Department department, int from, int to) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp())
            if (emp.getAge() > from && emp.getAge() < to) {
                employees.add(emp);
            }
        return employees;
    }

    /**
     *
     * @param department - department where we have employee;
     * @param bonus - bones which will add to salary;
     * @return employees salary with added bonus;
     */
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


