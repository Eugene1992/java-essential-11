package com.cbs.edu.hw_02;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Employee {

    private String name;
    private int age;
    private int salary;


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

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
