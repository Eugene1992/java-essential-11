package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class EmployeeService {

    public static String getSalaryInterval(Department department, int from, int to) {
        for (int i = 0; i < department.getEmp().size(); i++)
            if (department.getEmp().get(i).getSalary() > from && department.getEmp().get(i).getSalary() < to) {
                return department.getEmp().get(i).getName() +
                        department.getEmp().get(i).getAge() +
                        department.getEmp().get(i).getSalary();
            }
        return null;
    }

    public static List<Employee> getSalaryIntervalForEach(Department department, int from, int to) {
        List<Employee> employees = new ArrayList<>();
        for (Employee emp : department.getEmp())
            if (emp.getSalary() > from && emp.getSalary() < to) {
                employees.add(emp);
            }
        return employees;
    }

    public static List<Employee> getSalaryIntervalJava8(Department department, final int from, final int to) {
        return department
                .getEmp()
                .stream()
                .filter(e -> e.getSalary() > from && e.getSalary() < to)
                .collect(Collectors.toList());
    }
}
