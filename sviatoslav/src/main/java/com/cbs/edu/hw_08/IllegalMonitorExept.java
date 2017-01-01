package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class IllegalMonitorExept {
    public static void main(String[] args) {
        Thread thread = new Thread();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
