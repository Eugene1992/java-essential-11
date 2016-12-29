package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class outOfBoundExept {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        int[] a = new int[5];
        a[6] = 15;
    }
}
