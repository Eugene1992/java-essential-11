package com.cbs.edu.cw06.inner;

public class Test {
    public static void main(String[] args) {
        Ship.Engine engineOne = new Ship().new Engine();

        Ship ship = new Ship();

        Ship.Engine engineTwo = ship.new Engine();
    }
}
