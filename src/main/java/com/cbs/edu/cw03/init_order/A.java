package com.cbs.edu.cw03.init_order;

public class A {
    static {
        System.out.println("static A");
        STATIC_CONST = 10;
    }

    {
        System.out.println("non static A");
        CONST = 10;
    }

    final int CONST;
    final static int STATIC_CONST;

    public A() {
        System.out.println("constructor A");
    }
}
