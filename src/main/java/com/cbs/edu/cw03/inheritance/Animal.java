package com.cbs.edu.cw03.inheritance;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void someAnimalMethod() {
        System.out.println("!!!");
    }

    protected void speak() {
        System.out.println("Animal say something...!");
    }
}
