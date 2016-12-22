package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Triangle extends Shape {
    public Triangle() {
        super(12, 32);
    }

    @Override
    public double getArea() {
        int area = (this.a * this.b)/2;
        return area;
    }

}
