package com.cbs.edu.hw_01;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public final class HumanService {

    private HumanService() {
    }

    public static int getAvgGrowth(ArrayList<Human> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).getGrowth();
        }
        return sum / array.size();
    }
}

