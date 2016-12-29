package com.cbs.edu.cw_09;

import java.util.HashMap;

public class HashCodeEqualsTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 10000, 23, new Department());
        Employee employee2 = new Employee("Sergey", 10000, 23, new Department());
        Employee employee3 = new Employee("Sergey", 10000, 23, new Department());

        int hashCode = employee1.hashCode();

        System.out.println(hashCode);


        HashMap<String, Employee> map = new HashMap<>();

        map.put("First", employee1);

        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());

        Employee first = map.get("First");
    }
}
