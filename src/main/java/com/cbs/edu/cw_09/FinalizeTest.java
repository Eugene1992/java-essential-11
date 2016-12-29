package com.cbs.edu.cw_09;

public class FinalizeTest {
    public static void main(String[] args) {
        Employee employee;

        for (int i = 0; i < 1000; i++) {
            employee = new Employee("Ivan", 10000, 23, new Department());
            employee = null;

            System.gc();
        }
    }
}
