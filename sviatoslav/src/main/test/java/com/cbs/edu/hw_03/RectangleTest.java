package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class RectangleTest {
    Rectangle rectangle = new Rectangle(4, 4, "sdfgfg");

    @Test
    public void getArea() throws Exception {
        final double EXPECTED_RESULT = rectangle.getA() * rectangle.getB();
        final double RESULT = rectangle.getArea();
        assertEquals(EXPECTED_RESULT, RESULT, 2);
    }

}