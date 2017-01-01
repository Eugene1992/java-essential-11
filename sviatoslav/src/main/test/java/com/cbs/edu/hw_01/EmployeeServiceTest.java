package com.cbs.edu.hw_01;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class EmployeeServiceTest {
    private double sum = 0;
    private ArrayList<Employee> employees;

    @Before
    public void setUp() {
        employees = new ArrayList<>();
        employees.add(new Employee("alex", "manager", 2112));
        employees.add(new Employee("bob", "manager", 15582));
        employees.add(new Employee("alex", "manager", 399874));
        for (int i = 0; i < employees.size(); i++) {
            sum = sum + employees.get(i).getSalary();
        }
    }

    @Test
    public void getAverage() {
        final double EXPECTED_RESULT = sum / employees.size();
        final double RESULT = EmployeeService.getAverage(employees);
        assertEquals(EXPECTED_RESULT, RESULT, 2 );
    }
}

