package com.cbs.edu.hw_07;

import java.util.Stack;

/**
 * Created by Sviatoslav on 28.12.2016.
 */
public class MainStack {
    public static void main(String[] args) {
        StackMethods stackMethods = new StackMethods(new Stack<Integer>());

        stackMethods.insert();
        stackMethods.get();


    }
}
