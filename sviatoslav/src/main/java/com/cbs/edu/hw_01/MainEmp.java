package com.cbs.edu.hw_01;

import java.util.ArrayList;
import java.util.Collections;

import static com.cbs.edu.hw_01.EmployeeService.getAverage;


/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class MainEmp {
    public static void main(String[] args) {

        ArrayList<Employee> arr = new ArrayList<Employee>(5);
        Employee employee1 = new Employee("Arek", "Worker", 1453);
        Employee employee2 = new Employee("Alex", "Worker", 4562);
        Employee employee3 = new Employee("Ivan", "Worker", 722876);
        Employee employee4 = new Employee("Robert", "Manager", 12423);
        Employee employee5 = new Employee("Bob", "Director", 4567372);

        arr.add(employee1);
        arr.add(employee2);
        arr.add(employee3);
        arr.add(employee4);
        arr.add(employee5);

        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Employee: " + arr.get(i).getName() +
                    ", Position: " + arr.get(i).getPosition() +
                    ", Salary:" + arr.get(i).getSalary());
        }
        getAverage(arr);
        System.out.println();
        System.out.println("Avarage: " + getAverage(arr));
    }
}
