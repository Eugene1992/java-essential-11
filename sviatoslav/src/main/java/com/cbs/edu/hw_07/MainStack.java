package com.cbs.edu.hw_07;

/**
 * Created by Sviatoslav on 28.12.2016.
 */
public class MainStack {
    public static void main(String[] args) {
        StackMethods stackMethods = new StackMethods(10);
        stackMethods.push(1000);
        stackMethods.push(1001);
        stackMethods.push(1002);
        stackMethods.push(1003);

        stackMethods.pop();
        stackMethods.pop();
        stackMethods.pop();
    }
}
