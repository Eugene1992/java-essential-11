package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Square extends Shape {

    public Square(int a) {
        super(a);
    }

    @Override
    public double getArea() {
        return (int) Math.pow(this.a, 2);
    }

}
