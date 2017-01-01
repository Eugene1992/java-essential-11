package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class OutOfBoundExept {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[6] = 15;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
