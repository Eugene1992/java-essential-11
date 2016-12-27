package com.cbs.edu.cw07.local;

import java.io.Serializable;

public class Test {
    public static String STR = "sas";

    public static void main(String[] args) {

        String someString = "Some string";

        class Local extends Object implements Serializable {

            public String someField;

            public Local(String someField) {
                this.someField = someField;
            }

            public void f(){
                System.out.println(someString);
                System.out.println(STR);
            }
        }

        Local local = new Local("Hello world");

        System.out.println(local.someField);
        local.f();
    }

    public static void f() {
//        Local local = new Local();
    }
}
