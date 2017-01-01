package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class StringOutOfBoundExept {
    public static void main(String[] args) {
        String string = " ";
        try {
            char ch = string.charAt(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
