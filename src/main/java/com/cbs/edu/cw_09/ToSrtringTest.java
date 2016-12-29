package com.cbs.edu.cw_09;

public class ToSrtringTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 23, 10000, new Department());

        System.out.println(employee.toString());

        String str = "Hello, " + employee + true + 1 + 0.21 + new Object();

        Class<?> aClass = employee.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());
    }
}
