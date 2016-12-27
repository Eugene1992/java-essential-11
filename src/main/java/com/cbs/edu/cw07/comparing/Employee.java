package com.cbs.edu.cw07.comparing;

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private int salary;
    private Gender gender;

    public Employee(String name, int age, int salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public void setSalary(int salary) {
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

    public Gender getGender() {
        return gender;
    }

    @Override
    public int compareTo(Employee employee) {
        /*if (this.salary > employee.salary) return 1;
        if (this.salary < employee.salary) return -1;
        return 0;*/
        return this.salary - employee.salary;
    }

    enum Gender {
        MALE, FEMALE
    }

    @Override
    public String toString() {
        return "[" + salary + "]";
    }
}
