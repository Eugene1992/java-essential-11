package com.cbs.edu.hw_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int sec = 100000000;
        TimeStampImpl timeStamp = new TimeStampImpl();
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            arrList.add(new Random().nextInt());
            linkedList.add(new Random().nextInt());
        }

        System.out.println("Вставка в конец ArrayLista занимает: " + timeStamp.addLastToList(arrList)/sec + "c");
        System.out.println("Вставка в конец LinkedLista занимает: " + timeStamp.addLastToList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Вставка в начало ArrayLista занимает: " + timeStamp.addFirstToList(arrList)/sec + "c");
        System.out.println("Вставка в начало LinkedLista занимает: " + timeStamp.addFirstToList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Вставка в середину ArrayLista занимает: " + timeStamp.addInMiddleToList(arrList)/sec + "c");
        System.out.println("Вставка в середину LinkedLista занимает: " + timeStamp.addInMiddleToList(linkedList)/sec + "c");


        System.out.println();
        System.out.println();

        System.out.println("Достать элемент с конца ArrayLista занимает: " + timeStamp.getLastFromList(arrList)/sec + "c");
        System.out.println("Достать элемент с конца LinkedLista занимает: " + timeStamp.getLastFromList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Достать элемент с середины ArrayLista занимает: " + timeStamp.getMiddleFromList(arrList)/sec + "c");
        System.out.println("Достать элемент с середины LinkedLista занимает: " + timeStamp.getMiddleFromList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Достать элемент с начала ArrayLista занимает: " + timeStamp.getFirstFromList(arrList)/sec + "c");
        System.out.println("Достать элемент с начала LinkedLista занимает: " + timeStamp.getFirstFromList(linkedList)/sec + "c");

        System.out.println();
        System.out.println();

        System.out.println("Изменить элемент в начале ArrayLista занимает: " +  timeStamp.setFirstToList(arrList)/sec + "c");
        System.out.println("Изменить элемент в начале LinkedLista занимает: " +  timeStamp.setFirstToList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Изменить элемент в середине ArrayLista занимает: " +  timeStamp.setInMiddleToList(arrList)/sec + "c");
        System.out.println("Изменить элемент в середине LinkedLista занимает: " +  timeStamp.setInMiddleToList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Изменить элемент в конце ArrayLista занимает: " +  timeStamp.setLastToList(arrList)/sec + "c");
        System.out.println("Изменить элемент в конце LinkedLista занимает: " +  timeStamp.setLastToList(linkedList)/sec + "c");

        System.out.println();
        System.out.println();

        System.out.println("Удалить элемент в начале ArrayLista занимает: " + timeStamp.removeFirstFromList(arrList)/sec + "c");
        System.out.println("Удалить элемент в начале LinkedLista занимает: " + timeStamp.removeFirstFromList(arrList)/sec + "c");

        System.out.println();

        System.out.println("Удалить элемент в середине ArrayLista занимает: " + timeStamp.removeInMiddleFromList(arrList)/sec + "c");
        System.out.println("Удалить элемент в середине LinkedLista занимает: " + timeStamp.removeInMiddleFromList(linkedList)/sec + "c");

        System.out.println();

        System.out.println("Удалить элемент в конце ArrayLista занимает: " + timeStamp.removeLastFromList(arrList)/sec + "c");
        System.out.println("Удалить элемент в конце LinkedLista занимает: " + timeStamp.removeLastFromList(linkedList)/sec + "c");
    }
}
