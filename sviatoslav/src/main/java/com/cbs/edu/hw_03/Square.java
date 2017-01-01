package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Square extends Shape {

    public Square(int a, String name) {
        super(a, name);
    }

    @Override
    public double getArea() {
        return (int) Math.pow(a, 2);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
