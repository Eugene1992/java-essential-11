package com.cbs.edu.cw04.interfaces.two;

public class Wind implements IMoveble {

    private int speed;

    public Wind(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
