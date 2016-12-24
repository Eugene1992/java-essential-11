package com.cbs.edu.hw_02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class EmployeeServiceTest {
    public  int salary = 15000;
    public  int bonus = 5000;
    public  int from = 5000;
    public  int to = 15001;
    public int age = 85;
    public int fAge = 15;
    public int tAge = 45;


    @Test
    public void getSalaryIntervalForEach() throws Exception {
        assertEquals(true, salary > from && salary < to);
    }

    @Test
    public void getAgeIntervalForEach() throws Exception {
        assertEquals(false, age > fAge && age < tAge);
    }

   @Test
    public void addBonus() throws Exception {
        assertEquals(20000, salary + bonus);
    }

}