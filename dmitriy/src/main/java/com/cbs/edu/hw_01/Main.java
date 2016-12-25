package com.cbs.edu.hw_01;

import java.util.ArrayList;
import java.util.Collections;

import static com.cbs.edu.hw_01.HumanService.getAvgGrowth;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Human> array = new ArrayList(5);

        Human human1 = new Human("Peter", 180, 20);
        Human human2 = new Human("Dima", 170, 19);
        Human human3 = new Human("Vasya", 175, 22);
        Human human4 = new Human("Max", 192, 18);
        Human human5 = new Human("Igor", 187, 25);

        array.add(human1);
        array.add(human2);
        array.add(human3);
        array.add(human4);
        array.add(human5);

        //Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            System.out.println("Human: "+array.get(i).getName()+
                    "|Growth: "+array.get(i).getGrowth()+
                    "|Age: "+array.get(i).getAge());
        }

        System.out.println("\nAvarage growth: " + getAvgGrowth(array));
    }
}

