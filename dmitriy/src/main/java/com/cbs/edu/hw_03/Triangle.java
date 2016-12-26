package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Triangle extends Shape {

    private int h;

    public Triangle(int a, int h, String name) {
        super(a, name);
        this.h = h;
    }

    @Override
    public double getSquare() {
        return a * h / 2;
    }

    @Override
    public String getName() {
        return name;
    }
}
