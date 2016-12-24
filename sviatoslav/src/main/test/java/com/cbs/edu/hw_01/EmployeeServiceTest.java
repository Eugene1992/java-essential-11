package com.cbs.edu.hw_01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class EmployeeServiceTest {
    private final List<Integer> list = new ArrayList<>();

    @Before
    public void init() {
        list.add(10);
        list.add(15);
        list.add(20);
    }
    @After
    public void tearDown(){
        list.clear();
    }

    @Test
    public void getAverage() throws Exception {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
             sum = sum + list.get(i);
        }
        int avg = sum / list.size();
        assertEquals(15, avg);
    }
}

