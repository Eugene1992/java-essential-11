package com.cbs.edu.hw_02;

/**
 * Class for creating new employee.
 * @author Sviatoslav
 * @version 2.0
 */
public class Employee {
    private String name;
    private int age;
    private int salary;

    /**
     * Constructor
     * @param name - name for new employee;
     * @param age - age for new employee;
     * @param salary - salary for employee;
     */
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
