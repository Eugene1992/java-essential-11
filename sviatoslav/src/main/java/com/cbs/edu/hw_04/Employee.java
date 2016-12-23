package com.cbs.edu.hw_04;

/**
 * Created by Sviatoslav on 23.12.2016.
 */
public class Employee {
    private String name;
    private  int age;
    private  int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
