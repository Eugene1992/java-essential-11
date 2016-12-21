package com.cbs.edu.cw03.init_order;

public class B extends A {
    static {
        System.out.println("static B");
    }

    {
        System.out.println("non static B");
    }

    public B() {
        System.out.println("constructor B");
    }
}
