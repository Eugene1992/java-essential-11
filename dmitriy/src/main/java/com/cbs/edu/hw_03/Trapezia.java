package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Trapezia extends Shape {
    private int h;

    public Trapezia(int a, int b, int h, String name){
        super(a, b, name);
        this.h = h;
    }

    @Override
    public double getSquare(){
        return ((a+b)/2)*h;
    }

    @Override
    public String getName(){
        return name;
    }
}
