package com.cbs.edu.cw_10.wildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        HomeCat homeCat = new HomeCat();

        printEverything(animal, 7);
        printEverything(cat, 7);
        printEverything(homeCat, 7);

//        printCat(animal, 7);
        printCat(cat, 7);
        printCat(homeCat, 7);

        Collections.sort(new ArrayList<Cat>(), new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        });
    }

    // <B> - нвариантность
    public static <E> void printEverything(E elem, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(elem);
        }
    }

    // <? extends B> - ковариантность
    public static <E extends Cat> void printCat(E elem, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(elem);
        }
    }

//    <? super B> - контрвариантность
}
