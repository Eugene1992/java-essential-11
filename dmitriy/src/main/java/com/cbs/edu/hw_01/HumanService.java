package com.cbs.edu.hw_01;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 25.12.2016.
 */
public class HumanService {

    public static int getAvgGrowth(ArrayList<Human> array)
    {
        int sum = 0;
        int avg;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i).getGrowth();
        }
        avg = sum/array.size();
        return avg;
    }


}

