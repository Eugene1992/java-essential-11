package com.cbs.edu.hw_03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class TrapezoidTest {
    private int a = 2;
    private int b = 2 ;
    private int h =  2;
    @Test
    public void getArea() throws Exception {
        assertEquals( 4, (( a + b ) * h) / 2);
    }

}