package com.cbs.edu.cw04.interfaces.two;

public class Human implements IMoveble {

    private int speed;

    public Human(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
