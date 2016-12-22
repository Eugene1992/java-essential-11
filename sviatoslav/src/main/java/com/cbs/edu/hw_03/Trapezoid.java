package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Trapezoid extends Shape{
    private int h;
    public Trapezoid(int h){
        super(10,15);
        this.h = h;
    }

    @Override
    public double getArea() {
        double area =( ( this.a + this.b ) * this.h) / 2;
        return area;
    }

}
