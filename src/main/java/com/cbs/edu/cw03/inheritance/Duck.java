package com.cbs.edu.cw03.inheritance;

public class Duck extends Animal {

    private String specialDuckField;

    public Duck(String name, String specialDuckField) {
        super(name);
        this.specialDuckField = specialDuckField;
    }

    @Override
    public void speak() {
        System.out.println(super.name + " say " + specialDuckField);
    }
}
