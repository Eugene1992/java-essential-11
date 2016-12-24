package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class TriangleTest {
    private int a = 5;
    private int b = 4;

    @Test
    public void getArea() throws Exception {
        assertEquals(10, (( a * b ) / 2));
    }

}