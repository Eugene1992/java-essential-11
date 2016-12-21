package com.cbs.edu.cw03.inheritance;

public class Dog extends Animal {

    private String specialDogField;

    public Dog(String name, String specialDogField) {
        super(name);
        this.specialDogField = specialDogField;
    }

    @Override
    public void speak() {
        System.out.println(super.name + " say " + specialDogField);
    }
}
