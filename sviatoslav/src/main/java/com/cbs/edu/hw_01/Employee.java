package com.cbs.edu.hw_01;


public class Employee implements Comparable<Employee> {
    private String name;
    private String position;
    private int salary;


    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }


    public int compareTo(Employee o1) {
        return o1.getSalary() - this.getSalary();
    }

}

