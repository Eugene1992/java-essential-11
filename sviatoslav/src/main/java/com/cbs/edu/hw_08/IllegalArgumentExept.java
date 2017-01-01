package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class IllegalArgumentExept {
    public static void main(String[] args) {
        try {
            Thread.sleep(-1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
