package com.cbs.edu.hw_08;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class illegalMonitorExept {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.wait();

    }
}
