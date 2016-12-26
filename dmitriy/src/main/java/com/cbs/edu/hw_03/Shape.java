package com.cbs.edu.hw_03;

/**
 * Created by Дмитрий on 25.12.2016.
 */
// TODO: 26.12.2016 use abstraction!
public class Shape {
    protected int a;
    protected int b;
    protected String name;

    public Shape (int a, int b, String name){
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public Shape (int a, String name){
        this.a = a;
        this.name = name;
    }

    public double getSquare(){
        return 0;
    }

    public String getName(){
        return name;
    }
}
