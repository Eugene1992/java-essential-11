package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class RectangleTest {
    private int a = 12;
    private int b = 12;

    @Test
    public void getArea() throws Exception {
        assertEquals(144, a * b);
    }

}