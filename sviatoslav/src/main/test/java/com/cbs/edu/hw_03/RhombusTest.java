package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class RhombusTest {
    private int a = 12;
    private int b = 12;

    @Test
    public void getArea() throws Exception {
        assertFalse("Not today" ,a * b != 144);
    }

}