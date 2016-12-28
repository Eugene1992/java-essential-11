package com.cbs.edu.hw_07;

import java.util.Random;
import java.util.Stack;

/**
 * Created by Sviatoslav on 28.12.2016.
 */
public class StackMethods {
    private Random rnd = new Random();
    private Stack<Integer> stack;
    private static int size = 0;

    public StackMethods(Stack<Integer> stack) {
        this.stack = stack;
    }

    public void insert() {
        stack.push((-10 + rnd.nextInt(20 + 1)));
        size++;
        System.out.println("\nПредпологаемый размер стэка: " + size);
        System.out.println("Выводим стэк на экран: ");
        showStack();
        System.out.println("Размер Стэка: " + stack.size());
    }

    public void get() {
        stack.pop();
        size--;
        System.out.println("Предпологаемый размер стэка: " + size);
        System.out.println("Выводим стэк на экран: ");
        showStack();
        System.out.println("Размер Стэка: " + stack.size());
    }

    public void showStack() {
        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}
