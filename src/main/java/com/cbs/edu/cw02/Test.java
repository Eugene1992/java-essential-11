package com.cbs.edu.cw02;

import static com.cbs.edu.cw02.Employee.*;

public class Test {
    public static void main(String[] args) {
        Employee empOne = new Employee("Ivan", 10000, 23);
        Employee empTwo = new Employee("Sergey", 20000, 18);
        Employee empThree = new Employee();

        empOne.say();
        empTwo.say();

        System.out.println(empCount);
    }
}
