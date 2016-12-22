package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Rhombus extends Shape{
    public Rhombus(){
        super(10 ,3);
    }


    @Override
    public double getArea() {
        int area = this.a * this.b;
        return  area;
    }
}
