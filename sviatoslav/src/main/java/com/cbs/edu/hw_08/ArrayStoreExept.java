package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class ArrayStoreExept {
    public static void main(String[] args) {
        Object[] arr = new Integer[25];
        try {
            arr[0] = "sdfg";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
