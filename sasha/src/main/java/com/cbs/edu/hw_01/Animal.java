package com.cbs.edu.hw_01;


/**
 * Created by Санчос on 30.12.2016.
 */
public class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int compareTo(Animal o1) {
        return o1.getWeight() - this.getWeight();
    }
}
