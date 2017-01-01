package com.cbs.edu.hw_07;

import java.util.Arrays;

/**
 * Created by Sviatoslav on 28.12.2016.
 */
public class StackMethods {
    private int size;
    private int[] stack;
    private int[] newStack;
    private int top;

    public StackMethods(int size) {
        this.size = size;
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
        if (stack.length < size) {
            int top = ++this.top;
            stack[top] = element;
        } else if (stack.length >= size) {
            newStack = Arrays.copyOf(stack, size * 3 / 2 + 1);
            stack = null;
            stack = newStack;
            int top = ++this.top;
            stack[top] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        } else {
            int element = stack[top];
            top--;
            return element;
        }
    }
}
