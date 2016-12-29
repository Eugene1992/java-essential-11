package com.cbs.edu.hw_07;

import java.util.Arrays;

/**
 * Created by Sviatoslav on 28.12.2016.
 */
public class StackMethods {
    private int size;
    private int[] stack;
    private int[] newStack;
    private static int top;

    public StackMethods(int s) {
        this.size = s;
        stack = new int[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        boolean check = false;
        if (top == -1) {
            check = true;
        }
        return check;
    }

    public void push(int element) {
        int top = ++this.top;
        stack[top] = element;
        System.out.println(top);
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        } else {
            int element = stack[top];
            top--;
            newStack = Arrays.copyOf(stack, top);
            System.out.print(newStack.length + " ");
            return element;
        }
    }
}
