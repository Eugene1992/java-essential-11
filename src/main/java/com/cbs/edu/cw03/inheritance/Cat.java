package com.cbs.edu.cw03.inheritance;

public class Cat extends Animal {

    private String specialCatField;

    public Cat(String name, String specialCatField) {
        super(name);
        this.specialCatField = specialCatField;
    }

    @Override
    public void speak() {
        System.out.println(super.name + " say " + specialCatField);
    }
}
