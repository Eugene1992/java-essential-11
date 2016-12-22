package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Square extends Shape{
    public Square(){
        super(4);
    }

    @Override
    public double getArea() {
        int area = (int)Math.pow(this.a, 2);
       return area;
    }

}
