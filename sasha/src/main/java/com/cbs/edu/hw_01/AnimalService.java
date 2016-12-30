package com.cbs.edu.hw_01;

import java.util.ArrayList;

/**
 * Created by Санчос on 30.12.2016.
 */
public class AnimalService {
    private AnimalService() {
    }

    public static int getAvarage (ArrayList<Animal> animals) {
        int sum = 0;
        for (int i = 0; i < animals.size(); i++) {
            sum += animals.get(i).getWeight();
        }
        return sum / animals.size();
    }
}
