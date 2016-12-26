package com.cbs.edu.cw06.inner;


import java.io.Serializable;

/**
 * - inner внутренний non-static classes
 *  - local
 *  - anonymous
 * - nested вложенный static classes
 */
public class Ship extends SuperShip {

    public String shipField;
    private String privateShipField = "Ohh, it was private...";
    private Engine engine = new Engine();

    public class Engine extends SuperEngine implements Serializable {

        public String engineField;

        public void engineMethod() {
            System.out.println(privateShipField);
            privateShipMethod();
            System.out.println(Ship.this.superShipField);
        }

        public String getPrivateShipField() {
            return privateShipField;
        }
    }

    public void shipMethod() {
        System.out.println(shipField);
        System.out.println(superShipField);
        System.out.println(engine.superEngineField);

        superShipMethod();
        engine.superEngineMethod();
    }

    private void privateShipMethod() {
    }
}
