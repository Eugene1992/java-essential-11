package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class ArithmeticExept {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
