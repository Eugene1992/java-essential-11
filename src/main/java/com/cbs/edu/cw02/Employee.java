package com.cbs.edu.cw02;

public class Employee {

    private String name;
    private int salary;
    private int age;
    public static int empCount = 0;

    public Employee() {
    }

    public Employee(String name) {
        this(name, 0);
    }

    public Employee(String name, int salary) {
        this(name, salary, 0);
    }

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        empCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void a() {
        c(10);
    }

    public void b() {
        c(10);
    }

    private void c(int a) {
        for (int i = 0; i < 10; i++) {
            System.out.println(a);
        }
    }

    public void say() {
        System.out.printf("Hello, my name is %s! I'm %d years old!\n", name, this.age);
        System.out.println(name);
        System.out.println(empCount);
        a();
    }

    public static void printEmpCount(Employee emp) {
        System.out.println("Total employee count: " + empCount);
//        System.out.println(name);
        System.out.println(emp.name);
//        a();
        emp.a();
    }
}
