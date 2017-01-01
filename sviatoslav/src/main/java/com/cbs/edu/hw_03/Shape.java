package com.cbs.edu.hw_03;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public class Shape {
    protected int a;
    protected int b;
    protected String name;

    public Shape(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public Shape(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double getArea() {
        return 0;
    }

    public String getName() {
        return name;
    }
}
