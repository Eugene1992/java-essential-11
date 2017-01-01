package com.cbs.edu.hw_03;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class TrapezoidTest {
    Trapezoid trapezoid = new Trapezoid(4, 4, 4, "asdf");

    @Test
    public void getArea() throws Exception {
        final double EXPECTED_RESULT = (trapezoid.getA() + trapezoid.getB()) * trapezoid.getH() / 2;
        final double RESULT = trapezoid.getArea();
        Assert.assertEquals(EXPECTED_RESULT, RESULT, 2);
    }

}