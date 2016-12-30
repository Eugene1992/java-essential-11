package com.cbs.edu.cw_10;

public class GenericPairTest {
    public static void main(String[] args) {
        GenericPair<String, Integer> gpair1 = new GenericPair<>("10", 10);

        String key = gpair1.getKey();

        GenericPair<Double, Integer> gpair2 = new GenericPair<>(100.0, 10);
    }
}
