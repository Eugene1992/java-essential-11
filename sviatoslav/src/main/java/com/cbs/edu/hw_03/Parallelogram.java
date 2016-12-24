package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Parallelogram  extends Shape{
    public Parallelogram(int a, int b, String name){
        super(a, b, name);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
