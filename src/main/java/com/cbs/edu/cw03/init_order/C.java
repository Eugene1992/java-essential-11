package com.cbs.edu.cw03.init_order;

public class C extends B {
    static {
        System.out.println("static C");
    }

    {
        System.out.println("non static C");
    }

    public C() {
        System.out.println("constructor C");
    }
}
