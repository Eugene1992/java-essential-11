package com.cbs.edu.cw08;

import java.util.ArrayList;

public class MemoryErrorsTest {
    public static void main(String[] args) {
//        f(); // StackOverflow exception
        /*ArrayList<String> objects = new ArrayList<>();
        while (true) {
            objects.add("sddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        }*/

        int[] ints = new int[Integer.MAX_VALUE]; //
    }

    static void f() {
        f();
    }
}
