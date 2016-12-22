package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Parallelogram  extends Shape{
    public Parallelogram(){
        super(12, 15);
    }

    @Override
    public double getArea() {
        int area = this.a * this.b;
        return area;
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
