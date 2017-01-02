package com.cbs.edu.hw_02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 02.01.2017.
 */
public class EmployeeServiceTest {
    Department department;
    private int from = 1000;
    private int to = 2000;
    private List<Employee> employees;


    @Before
    public void setUp(){
        employees = new ArrayList<>();
        department = new Department("HR");
        department.getEmp().add(new Employee("adf", 20, 1000));
        department.getEmp().add(new Employee("sdf", 25, 1500));
        department.getEmp().add(new Employee("vbdf", 30, 2000));

    }


    @Test
    public void getSalaryIntervalForEach() throws Exception {
        for (Employee emp: department.getEmp() ) {
            if (emp.getSalary() > from && emp.getSalary() < to){
                employees.add(emp);
            }
        }
        final List<Employee> EXPECTED_RESULT = employees;
        final List<Employee> RESULT = EmployeeService.getSalaryIntervalForEach(department, from, to);
        Assert.assertEquals(EXPECTED_RESULT, RESULT);

    }

    @Test
    public void getAgeIntervalForEach() throws Exception {

    }

    @Test
    public void addBonus() throws Exception {

    }

}