package com.cbs.edu.cw06.nested;

public class Ship {

    public String shipField;
    private static String privateStaticShipField = "Ohh, it was private...";
    private Engine engine = new Engine();

    public static class Engine {

        public String engineField;

        public static void engineMethod() {
            System.out.println(privateStaticShipField);
        }
    }

    public void shipMethod() {

    }

    private void privateShipMethod() {
    }
}
