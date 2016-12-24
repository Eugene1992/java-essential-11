package com.cbs.edu.hw_02;

import static com.cbs.edu.hw_02.EmployeeService.*;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class MainEmp {
    public static void main(String[] args) {
        Employee emp = new Employee("Gleb", 22, 15000);
        Employee emp1 = new Employee("Alex", 50, 10000);
        Employee emp2 = new Employee("Ivan", 20, 12000);
        Employee emp3 = new Employee("Piotr", 35, 13000);
        Employee emp4 = new Employee("Vova", 30, 30000);
        Employee emp5 = new Employee("Lexa", 40, 25000);
        Employee emp6 = new Employee("Bob", 34, 17000);
        Employee emp7 = new Employee("Robert", 25, 40000);


        Department department = new Department("Department of developers");

        department.addEmployee(emp);
        department.addEmployee(emp1);
        department.addEmployee(emp2);
        department.addEmployee(emp3);
        department.addEmployee(emp4);
        department.addEmployee(emp5);
        department.addEmployee(emp6);
        department.addEmployee(emp7);


        for (Employee employee : getSalaryIntervalForEach(department, 10000, 20000)) {
            System.out.printf("%s : %d : %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (Employee employee : getAgeIntervalForEach(department, 20, 30)) {
            System.out.printf("%s : %d : %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }

        for (Employee employee : addBonus(department, 15000)) {
            System.out.printf("%s : %d : %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }

    }
}
