package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class RhombusTest {
    Rhombus rhombus = new Rhombus(4, 4, "adf");

    @Test
    public void getArea() throws Exception {
        final double EXPECTED_RESULT = rhombus.getA() * rhombus.getB();
        final double RESULT = rhombus.getArea();
        assertEquals(EXPECTED_RESULT, RESULT, 2);
    }

}