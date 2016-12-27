package com.cbs.edu.hw06;

/**
 * Created by Дмитрий on 27.12.2016.
 */
public class CarB {
    private String brand;   //required
    private String model;   //required
    private String type;    //required
    private double engineCapacity;
    private int maxSpeed;
    private int price;

    private CarB(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.type = carBuilder.type;
        this.engineCapacity = carBuilder.engineCapacity;
        this.maxSpeed = carBuilder.maxSpeed;
        this.price = carBuilder.price;
    }

    public static class CarBuilder {
        private String brand;   //required
        private String model;   //required
        private String type;    //required
        private double engineCapacity;
        private int maxSpeed;
        private int price;

        public CarBuilder(String brand, String model, String type) {
            this.brand = brand;
            this.model = model;
            this.type = type;
        }

        public CarBuilder setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public CarBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public CarB build() {
            return new CarB(this);
        }
    }

    @Override
    public String toString() {
        return "CarB{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        CarB carV = new CarBuilder("Volkswagen", "Golf GTI", "sedan").setPrice(1000).build();
        System.out.println(carV);
    }
}
