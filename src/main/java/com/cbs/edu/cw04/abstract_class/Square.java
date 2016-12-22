package com.cbs.edu.cw04.abstract_class;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Square extends Shape {

    public Square(int a) {
        super(a);
    }

    @Override
    public double getArea() {
        return (int) Math.pow(a, 2);
    }
}
