package com.cbs.edu.cw03.comp_aggr;

public class Test {
    public static void main(String[] args) {
        Freshener freshener = new Freshener();
        Car car = new Car("Tesla", "Blue", freshener);
        car.run();

        car = null;
    }
}
