package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class ParallelogramTest {
    Parallelogram parallelogram = new Parallelogram(4, 4, "sdfg");

    @Test
    public void getArea() throws Exception {
        final double EXPECTED_RESULT = parallelogram.getA() * parallelogram.getB();
        final double RESULT = parallelogram.getArea();
        assertEquals(EXPECTED_RESULT, RESULT, 3);
    }

}