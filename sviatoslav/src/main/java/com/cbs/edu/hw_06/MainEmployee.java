package com.cbs.edu.hw_06;

/**
 * Created by Sviatoslav on 27.12.2016.
 */
public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Lolli", "Pop", "Director").build();
        Employee manager = new Employee.EmployeeBuilder("adf", "adf", "Manager")
                .age(34)
                .sex("Male").build();
    }
}
