package com.cbs.edu.hw_01;

import java.util.ArrayList;

import static com.cbs.edu.hw_01.AnimalService.getAvarage;

/**
 * Created by Санчос on 30.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> array = new ArrayList<>(5);

        Animal animal1 = new Animal("Cat", 8, 3);
        Animal animal2 = new Animal("Dog", 5, 15);
        Animal animal3 = new Animal("Cow", 7, 150);
        Animal animal4 = new Animal("Duck", 3, 3);
        Animal animal5 = new Animal("Sheep", 4, 70);

        array.add(animal1);
        array.add(animal2);
        array.add(animal3);
        array.add(animal4);
        array.add(animal5);

        //Sort(array);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Animal: " + array.get(i).getName() +
                    "  Age: " + array.get(i).getAge() +
                    "  Weight: " + array.get(i).getWeight());
        }

        System.out.println("\nAverage weight: " + getAvarage(array));
    }
}
