package com.cbs.edu.cw08;

import java.util.Random;

public class TryCatchTest {
    public static void main(String[] args) {
        System.out.println("Start");
        Random random = new Random();
        int k = random.nextInt();
        while (k != 10);
        try {
//            int i = 10 / 0;
//            Object o = null;
//            o.hashCode();
            System.out.println("Simple");
//            System.exit(0);
        } catch (ArithmeticException exp) {
            exp.printStackTrace();
        } finally {
            System.out.println("After all...");
        }
        System.out.println("End");
    }
}
