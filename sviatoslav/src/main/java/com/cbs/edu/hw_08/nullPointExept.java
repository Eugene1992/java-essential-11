package com.cbs.edu.hw_08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sviatoslav on 29.12.2016.
 */
public class nullPointExept {
    public static void main(String[] args) throws NullPointerException{
        List<Integer> list = new ArrayList<>();
        list = null;
        list.add(644);

    }
}
