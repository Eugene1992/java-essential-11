package com.cbs.edu.cw04.abstract_class;

public class Rectangle extends Shape {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
