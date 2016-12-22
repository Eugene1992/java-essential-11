package com.cbs.edu.cw04.interfaces.two;

public class Cat extends Animal implements IMoveble {

    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }

    @Override
    public void d() {

    }
}
