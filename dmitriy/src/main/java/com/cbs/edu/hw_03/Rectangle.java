package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Rectangle extends Shape {

    public Rectangle (int a, int b, String name) {
        super (a, b, name);
    }

    @Override
    public double getSquare(){
        return a*b;
    }

    @Override
    public String getName(){
        return super.getName();
    }
}
