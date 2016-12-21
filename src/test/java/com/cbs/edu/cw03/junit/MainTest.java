package com.cbs.edu.cw03.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    private Main main;
    private final int FIRST_NUM = 10;
    private final int SECOND_NUM = 20;

    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void mulTest() throws Exception {
        final int EXPECTED_RESULT = FIRST_NUM * SECOND_NUM;
        final int RESULT = main.mul(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(EXPECTED_RESULT, RESULT);
    }

    @Test
    public void sumTest() throws Exception {
        final int EXPECTED_RESULT = FIRST_NUM + SECOND_NUM;
        final int RESULT = main.sum(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(EXPECTED_RESULT, RESULT);
    }

    @Test(expected = ArithmeticException.class)
    public void divTest() throws Exception {
        final int EXPECTED_RESULT = FIRST_NUM / 0;
        final int RESULT = main.div(FIRST_NUM, 0);
        Assert.assertEquals(EXPECTED_RESULT, RESULT);
    }

    @Test(timeout = 500)
    public void timeTest() throws Exception {
        Thread.currentThread().sleep(400);
    }
}