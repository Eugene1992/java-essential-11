package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Trapezoid extends Shape {
    private int h;

    public Trapezoid(int a, int b, int h, String name) {
        super(a, b, name);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    @Override
    public double getArea() {
        return (a + b) * h / 2;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
