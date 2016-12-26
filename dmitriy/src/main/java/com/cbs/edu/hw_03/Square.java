package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Square extends Shape {

    public Square(int a, String name) {
        super(a, name);
    }

    @Override
    public double getSquare() {
        return a * a;
    }

    @Override
    public String getName() {
        return name;
    }
}
