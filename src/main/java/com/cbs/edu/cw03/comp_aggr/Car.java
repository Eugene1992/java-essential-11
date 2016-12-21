package com.cbs.edu.cw03.comp_aggr;

public class Car {

    private String model;
    private String color;
    private Engine engine = new Engine();
    private Freshener freshener;

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public void run() {
        freshener.smell();
        engine.on();
    }
}
