package com.cbs.edu.hw_02;

import java.util.ArrayList;
import java.util.Scanner;

import static com.cbs.edu.hw_02.EmployeeService.*;
/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee person1 = new Employee("Dima", 19, 1500);
        Employee person2 = new Employee("Georgy", 17, 1100);
        Employee person3 = new Employee("igor", 21, 1300);
        Employee person4 = new Employee("Peter", 25, 1400);
        Employee person5 = new Employee("Jonhy", 22, 1200);

        Department department = new Department("EPUM");

        department.addEmployee(person1);
        department.addEmployee(person2);
        department.addEmployee(person3);
        department.addEmployee(person4);
        department.addEmployee(person5);


        System.out.println("Input min value of salary");
        int minsalary = sc.nextInt();
        System.out.println("Input max value of salary");
        int maxsalary = sc.nextInt();

        for (Employee employee : getSalaryInterval(department, minsalary, maxsalary)){
            System.out.printf("Name: %s  Age: %d  Salary: %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }

        System.out.println("\nInput min value of age");
        int minage = sc.nextInt();
        System.out.println("Input min value of age");
        int maxage = sc.nextInt();

        for (Employee employee : getAgeinterval(department, minage, maxage)){
            System.out.printf("Name: %s  Age: %d  Salary: %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }

        System.out.println("\nInput bonus salary");
        double bonus = sc.nextDouble();

        for (Employee employee : addBonus(department, bonus)){
            System.out.printf("Name: %s  Age: %d  Salary: %d\n", employee.getName(), employee.getAge(), employee.getSalary());
        }

    }
}