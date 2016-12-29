package com.cbs.edu.cw_09;

import java.lang.reflect.Field;

public class GetClassTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 10000, 23, new Department());

        System.out.println(employee);

        Class<? extends Employee> aClass = employee.getClass();
        try {
            Field age = aClass.getDeclaredField("age");
            age.setAccessible(true);
            age.set(employee, 45);
        }
        catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(employee);
    }
}
