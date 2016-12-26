package com.cbs.edu.cw05;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(777);
        queue.add(777);
        queue.add(777);
        queue.add(777);

        List<Integer> arrayList = new ArrayList<>(queue);

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        arrayList.add(5, 777);

        System.out.println(arrayList);

        arrayList.remove(5);

        System.out.println(arrayList);

        arrayList.add(5);

        System.out.println(arrayList);

        while (arrayList.contains(5)) {
            arrayList.remove(new Integer(5));
        }

        System.out.println(arrayList);

        arrayList.set(arrayList.size() - 1, 777);

        System.out.println(arrayList);

        List<Integer> integers2 = arrayList.subList(4, 6);

        System.out.println(integers2);

//        arrayList.trimToSize();
    }
}
