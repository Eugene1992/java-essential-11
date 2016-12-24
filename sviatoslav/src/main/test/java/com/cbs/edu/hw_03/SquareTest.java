package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class SquareTest {
    private int a = 4;
    @Test
    public void getArea() throws Exception {
        assertTrue("No!", (int)Math.pow(a,2) == 16);
    }

}