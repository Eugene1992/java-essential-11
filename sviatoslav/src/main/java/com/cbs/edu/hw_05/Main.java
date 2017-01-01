package com.cbs.edu.hw_05;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.cbs.edu.hw_05.TimeStampImpl.Insert.*;

/**
 * Created by Sviatoslav on 24.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        ITimeStamp arrayList = new TimeStampImpl(new ArrayList<Integer>());
        ITimeStamp linkedList = new TimeStampImpl(new LinkedList<Integer>());


        System.out.println("Добавить в начало ArrayList'a занимает: "
                + arrayList.add(FIRST, 150, 40) + "c.");
        System.out.println("Добавить в начало LinkedList'a занимает: "
                + linkedList.add(FIRST, 150, 40) + "c.");

        System.out.println();

        System.out.println("Добавить в середину ArrayList'a занимает: "
                + arrayList.add(MIDDLE, 15, 15) + "c.");
        System.out.println("Добавить в середину LinkedList'a занимает: "
                + linkedList.add(MIDDLE, 15, 15) + "c.");

        System.out.println();

        System.out.println("Добавить в конец ArrayList'a занимает: "
                + arrayList.add(LAST, 45, 20) + "c.");
        System.out.println("Добавить в конец LinkedList'a занимает: "
                + linkedList.add(MIDDLE, 45, 20) + "c.");

        System.out.println();

        System.out.println("Плучить элемент с начала ArrayList'a занимает: "
                + arrayList.get(FIRST, 15) + "c.");
        System.out.println("Плучить элемент с начала LinkedList'a занимает: "
                + linkedList.get(FIRST, 15) + "c.");

        System.out.println();

        System.out.println("Плучить элемент с середины ArrayList'a занимает: "
                + arrayList.get(MIDDLE, 20) + "c.");
        System.out.println("Плучить элемент с середины LinkedList'a занимает: "
                + linkedList.get(MIDDLE, 20) + "c.");

        System.out.println();

        System.out.println("Плучить элемент с конца ArrayList'a занимает: "
                + arrayList.get(LAST, 30) + "c.");
        System.out.println("Плучить элемент с конца LinkedList'a занимает: "
                + linkedList.get(LAST, 30) + "c.");

        System.out.println();

        System.out.println("Изменить элемент в начале ArrayList'a занимает: "
                + arrayList.set(FIRST, 92, 10) + "c.");
        System.out.println("Изменить элемент в начале LinkedList'a занимает: "
                + linkedList.set(FIRST, 92, 10) + "c.");

        System.out.println();

        System.out.println("Изменить элемент в середине ArrayList'a занимает: "
                + arrayList.set(MIDDLE, 102, 10) + "c.");
        System.out.println("Изменить элемент в середине LinkedList'a занимает: "
                + linkedList.set(MIDDLE, 102, 10) + "c.");

        System.out.println();

        System.out.println("Изменить элемент в конце ArrayList'a занимает: "
                + arrayList.set(LAST, 102, 10) + "c.");
        System.out.println("Изменить элемент в конце LinkedList'a занимает: "
                + linkedList.set(LAST, 102, 10) + "c.");

        System.out.println();

        System.out.println("Удилить элемент в начале ArrayList'a занимает: "
                + arrayList.remove(FIRST, 5) + "c.");
        System.out.println("Удилить элемент в начале LinkedList'a занимает: "
                + linkedList.remove(FIRST, 5) + "c.");

        System.out.println();

        System.out.println("Удилить элемент в середине ArrayList'a занимает: "
                + arrayList.remove(MIDDLE, 5) + "c.");
        System.out.println("Удилить элемент в середине LinkedList'a занимает: "
                + linkedList.remove(MIDDLE, 5) + "c.");

        System.out.println();

        System.out.println("Удилить элемент в конце ArrayList'a занимает: "
                + arrayList.remove(LAST, 10) + "c.");
        System.out.println("Удилить элемент в конце LinkedList'a занимает: "
                + linkedList.remove(LAST, 10) + "c.");


    }
}
