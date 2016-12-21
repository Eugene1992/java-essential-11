package com.cbs.edu.cw03.inheritance;

public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " say " + "Muuuu!");
    }
}
