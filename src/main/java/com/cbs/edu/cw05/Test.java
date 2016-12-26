package com.cbs.edu.cw05;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new LinkedList<>();

//        long start = System.nanoTime();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add("Hello world");
        }
//        long end = System.nanoTime();
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
