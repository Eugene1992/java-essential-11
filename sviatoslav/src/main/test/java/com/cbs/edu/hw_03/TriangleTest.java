package com.cbs.edu.hw_03;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class TriangleTest {
    Triangle triangle = new Triangle(4, 4, "adsf");

    @Test
    public void getArea() throws Exception {
        final double EXPECTED_RESULT = triangle.getA() * triangle.getB() / 2;
        final double RESULT = triangle.getArea();
        Assert.assertEquals(EXPECTED_RESULT,RESULT, 2);
    }

}