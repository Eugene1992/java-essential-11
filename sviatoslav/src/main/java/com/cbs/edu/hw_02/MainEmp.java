package com.cbs.edu.hw_02;

import java.util.ArrayList;

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
        
        ArrayList<Employee> employees = new ArrayList<>();

        Department department = new Department("Department of developers");
        
        department.addEmployee(employees, emp);
        department.addEmployee(employees, emp1);
        department.addEmployee(employees, emp2);
        department.addEmployee(employees, emp3);
        department.addEmployee(employees, emp4);
        department.addEmployee(employees, emp5);
        department.addEmployee(employees, emp6);
        department.addEmployee(employees, emp7);

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " +
                                employees.get(i).getAge() + " " +
                                  employees.get(i).getSalary());
        }
        System.out.println();
        System.out.println("Employees in department " + Department.size);
    }

}
