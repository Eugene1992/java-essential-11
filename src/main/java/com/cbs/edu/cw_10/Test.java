package com.cbs.edu.cw_10;

public class Test {
    public static void main(String[] args) {

        Pair pair1 = new Pair("1", 10);
        Pair pair2 = new Pair(10, 10);
        Pair pair3 = new Pair(10, "10");

        String key1 = (String) pair1.getKey();
//        String key2 = (String) pair2.getKey();

        StringPair stringPair = new StringPair("10", "10");

        printNtimes("Hello world", 10);
        printNtimes(777, 5);
        printNtimes(new Object(), 3);
    }

    public static <E> void printNtimes(E elem, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(elem);
        }
    }
}
