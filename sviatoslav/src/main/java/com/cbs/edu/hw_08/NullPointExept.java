package com.cbs.edu.hw_08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class NullPointExept {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = null;
        try {
            list.add(644);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
