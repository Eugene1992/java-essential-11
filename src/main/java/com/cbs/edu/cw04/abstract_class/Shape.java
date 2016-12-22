package com.cbs.edu.cw04.abstract_class;

/**
 * Created by Sviatoslav on 22.12.2016.
 */
public abstract class Shape {

    protected int a;
    protected int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Shape(int a) {
        this.a = a;
    }

    public abstract double getArea();

    public void f() {
    }
}
