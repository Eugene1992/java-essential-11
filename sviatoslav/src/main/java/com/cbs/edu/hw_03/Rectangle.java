package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Rectangle extends Shape{
    public Rectangle(){
        super(10,15);
    }

    @Override
    public double getArea() {
        int area = this.a * this.b;
        return area;
    }
}

