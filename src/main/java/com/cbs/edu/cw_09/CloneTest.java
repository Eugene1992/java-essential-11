package com.cbs.edu.cw_09;

public class CloneTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 10000, 23, new Department("QA"));
        Employee clone = null;
        try {
            clone = (Employee) employee.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(employee);
        System.out.println(clone);

        clone.getDepartment().setName("GameDev");

        System.out.println(employee);
        System.out.println(clone);
    }
}
