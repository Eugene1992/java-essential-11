package com.cbs.edu.cw04.interfaces.two;

public class Car extends BusinessCar implements IMoveble{

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int hours) {
        return speed * hours;
    }
}
