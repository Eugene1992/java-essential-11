package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class NegativeSizeExept {
    public static void main(String[] args) throws NegativeArraySizeException {
        try {
            int[] arr = new int[-1];
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
