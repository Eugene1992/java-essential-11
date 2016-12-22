package com.cbs.edu.cw04.interfaces.two;

public class Test {
    public static void main(String[] args) {
        IMoveble car = new Car(200);
        IMoveble wind = new Wind(100);
        IMoveble human = new Human(35);
        IMoveble cat = new Car(40);

        countDistances(3, car, wind, human, cat);

        IMoveble.s();
        car.d();
    }

    public static void countDistances(int hours, IMoveble... movebles) {
        for (IMoveble moveble : movebles) {
            System.out.println(moveble.calcDistance(hours));
        }
    }
}
